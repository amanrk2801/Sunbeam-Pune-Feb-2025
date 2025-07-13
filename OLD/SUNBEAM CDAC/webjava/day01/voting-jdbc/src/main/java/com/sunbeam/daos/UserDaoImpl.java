package com.sunbeam.daos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.sunbeam.pojos.User;
import com.sunbeam.util.DbUtil;

public class UserDaoImpl implements UserDao {
	private Connection con;
	private PreparedStatement pstmtSignIn;
	private PreparedStatement pstmtUserDetails;
	private PreparedStatement pstmtUpdateStatus;
	private PreparedStatement pstmtRegisterUser;
	
	public UserDaoImpl() throws SQLException  {
		con = DbUtil.getConnection();
		
		String sql = "SELECT * FROM users WHERE email=? AND password=?";
		pstmtSignIn = con.prepareStatement(sql);
		sql = "SELECT * FROM users WHERE dob BETWEEN ? AND ? AND role='voter'";
		pstmtUserDetails = con.prepareStatement(sql);
		sql = "UPDATE users SET status=1 WHERE id=?";
		pstmtUpdateStatus = con.prepareStatement(sql);
		sql = "INSERT INTO users(first_name, last_name, email, password, dob, status, role) VALUES(?, ?, ?, ?, ?, ?, ?)";
		pstmtRegisterUser = con.prepareStatement(sql);
	}
	
	public void cleanUp() throws SQLException {
		pstmtSignIn.close();
		pstmtUserDetails.close();
		pstmtUpdateStatus.close();
		pstmtRegisterUser.close();
	}

	@Override
	public User signIn(String email, String password) throws SQLException {
		pstmtSignIn.setString(1, email);
		pstmtSignIn.setString(2, password);
		try(ResultSet rs = pstmtSignIn.executeQuery()) {
			if(rs.next()) {
				int id = rs.getInt("id");
				String firstName = rs.getString("first_name");
				String lastName = rs.getString("last_name");
				Date dob = rs.getDate("dob");
				boolean status = rs.getBoolean("status");
				String role = rs.getString("role");
				User u = new User(id, firstName, lastName, email, password, dob, status, role);
				return u;
			}
		}
		return null;
	}

	@Override
	public List<User> getUserDetails(Date begin, Date end) throws SQLException {
		List<User> list = new ArrayList<User>();
		pstmtUserDetails.setDate(1, begin);
		pstmtUserDetails.setDate(2, end);
		try(ResultSet rs = pstmtUserDetails.executeQuery()) {
			while(rs.next()) {
				int id = rs.getInt("id");
				String firstName = rs.getString("first_name");
				String lastName = rs.getString("last_name");
				String email = rs.getString("email");
				String password = rs.getString("password");
				Date dob = rs.getDate("dob");
				boolean status = rs.getBoolean("status");
				String role = rs.getString("role");
				User u = new User(id, firstName, lastName, email, password, dob, status, role);				
				list.add(u);
			}
		}
		return list;
	}

	@Override
	public String voterRegistration(User v) throws SQLException {
		pstmtRegisterUser.setString(1, v.getFirstName());
		pstmtRegisterUser.setString(2, v.getLastName());
		pstmtRegisterUser.setString(3, v.getEmail());
		pstmtRegisterUser.setString(4, v.getPassword());
		pstmtRegisterUser.setDate(5, v.getDob());
		pstmtRegisterUser.setBoolean(6, v.getStatus());
		pstmtRegisterUser.setString(7, v.getRole());
		int count = pstmtRegisterUser.executeUpdate();
		if(count == 1)
			return "Voter Registered!";
		return "Voter Registration Failed!";
	}

	@Override
	public String changePassword(String email, String oldPwd, String newPwd) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteVoterDetails(int voterId) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateVotingStatus(int voterId) throws SQLException {
		pstmtUpdateStatus.setInt(1, voterId);
		int count = pstmtUpdateStatus.executeUpdate();
		if(count == 1)
			return "Vote Status updated to 1/true";
		return "Vote status not updated";
	}

}
