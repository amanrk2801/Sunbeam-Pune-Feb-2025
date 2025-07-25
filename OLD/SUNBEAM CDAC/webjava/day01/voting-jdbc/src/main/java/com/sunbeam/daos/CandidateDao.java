package com.sunbeam.daos;

import java.sql.SQLException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Optional;

import com.sunbeam.pojos.Candidate;

public interface CandidateDao {
    //add a method to get list of all candidates
    List<Candidate> getAllCandidates() throws SQLException;
    // add a method to increment chosen candidate votes
    String updateVotes(int candidateId) throws SQLException;
    // add a method to get top 2 candidates
    List<Candidate> getTop2Candidates() throws SQLException;
    // add a method to get party wise votes
    LinkedHashMap<String, Integer> getPartywiseVotes() throws SQLException;
    // delete candidate details
    String deleteCandidateDetails(int candidateId) throws SQLException;
    // update candidate details
    String updateCandidateDetails(String newParty,int votes,int candidateId)throws SQLException;
    // find candidate and return
    Optional<Candidate> findById(int candidateId) throws SQLException;
}
