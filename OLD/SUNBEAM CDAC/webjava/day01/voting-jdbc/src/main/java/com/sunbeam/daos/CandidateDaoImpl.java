package com.sunbeam.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Optional;

import com.sunbeam.pojos.Candidate;
import com.sunbeam.util.DbUtil;

public class CandidateDaoImpl implements CandidateDao {
	// fields
	private Connection con;
	private PreparedStatement pstmtGetAll;
	private PreparedStatement pstmtGetTop2;
	private PreparedStatement pstmtPartywiseVotes;
	private PreparedStatement pstmtUpdateVotes;
	private PreparedStatement pstmtFindById;
	
	// methods
	public CandidateDaoImpl() throws SQLException {
		// get connection and create statements
		con = DbUtil.getConnection();
		
		String sql = "SELECT * FROM candidates";
		pstmtGetAll = con.prepareStatement(sql);
		sql = "SELECT * FROM candidates ORDER BY votes DESC LIMIT 2";
		pstmtGetTop2 = con.prepareStatement(sql);
		sql = "SELECT party, SUM(votes) total FROM candidates GROUP BY party ORDER BY total DESC";
		pstmtPartywiseVotes = con.prepareStatement(sql);
		sql = "UPDATE candidates SET votes=votes+1 WHERE id=?";
		pstmtUpdateVotes = con.prepareStatement(sql);
		sql = "SELECT * FROM candidates WHERE id=?";
		pstmtFindById = con.prepareStatement(sql);
	}
	
	@Override
	public List<Candidate> getAllCandidates() throws SQLException {
		List<Candidate> list = new ArrayList<Candidate>();
		try(ResultSet rs = pstmtGetAll.executeQuery()) {
			while(rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String party = rs.getString("party");
				int votes = rs.getInt("votes");
				Candidate c = new Candidate(id, name, party, votes);
				list.add(c);
			}
		} // rs.close();
		return list;
	}
	@Override
	public String updateVotes(int candidateId) throws SQLException {
		pstmtUpdateVotes.setInt(1, candidateId);
		int count = pstmtUpdateVotes.executeUpdate();
		if(count == 1)
			return "Vote updated successfully!";
		return "Vote update failed!";
	}
	@Override
	public List<Candidate> getTop2Candidates() throws SQLException {
		List<Candidate> list = new ArrayList<Candidate>();
		try(ResultSet rs = pstmtGetTop2.executeQuery()) {
			while(rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String party = rs.getString("party");
				int votes = rs.getInt("votes");
				Candidate c = new Candidate(id, name, party, votes);
				list.add(c);
			}
		} // rs.close();
		return list;
	}
	@Override
	public LinkedHashMap<String, Integer> getPartywiseVotes() throws SQLException {
		LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
		try(ResultSet rs = pstmtPartywiseVotes.executeQuery()) {
			while(rs.next()) {
				String party = rs.getString("party");
				int votes = rs.getInt("total");
				map.put(party, votes);
			}		
		} // rs.close();
		return map;
	}
	@Override
	public String deleteCandidateDetails(int candidateId) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String updateCandidateDetails(String newParty, int votes, int candidateId) throws SQLException {
		// TODO Lab Assignment
		return null;
	}
	
	@Override
	public Optional<Candidate> findById(int candidateId) throws SQLException {
		pstmtFindById.setInt(1, candidateId);
		try(ResultSet rs = pstmtFindById.executeQuery()) {
			if(rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String party = rs.getString("party");
				int votes = rs.getInt("votes");
				Candidate c = new Candidate(id, name, party, votes);
				return Optional.of(c);
			}
		} // rs.close();
		return Optional.empty();
	}
	
	public void cleanUp() throws SQLException {
		// TODO close all statements
		pstmtGetAll.close();
		pstmtGetTop2.close();
		pstmtPartywiseVotes.close();
	}
}
