package com.sunbeam.tester;

import java.sql.Connection;
import java.sql.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import com.sunbeam.daos.CandidateDaoImpl;
import com.sunbeam.daos.UserDao;
import com.sunbeam.daos.UserDaoImpl;
import com.sunbeam.pojos.Candidate;
import com.sunbeam.pojos.User;
import com.sunbeam.util.DbUtil;

public class VotingMain {
	public static void main(String[] args) throws Exception {
		final String DB_URL = "jdbc:mysql://localhost:3306/dacdb";
		final String DB_USER = "nilesh";
		final String DB_PASSWD = "nilesh";
		CandidateDaoImpl candDao = null;
		UserDaoImpl userDao = null;
		Scanner sc = new Scanner(System.in);
		try {
			DbUtil.openConnection(DB_URL, DB_USER, DB_PASSWD);
			candDao = new CandidateDaoImpl();
			userDao = new UserDaoImpl();
			
			System.out.print("Enter Candidate Id: ");
			int candId = sc.nextInt();
			Optional<Candidate> optCand = candDao.findById(candId);
			Candidate cand = optCand.orElseThrow(() -> new RuntimeException("No Candidate Found."));
			System.out.println("Found: " + cand);
			
//			List<Candidate> candList = candDao.getAllCandidates();
//			for (Candidate c : candList)
//				System.out.println(c);

//			List<Candidate> candList = candDao.getTop2Candidates();
//			for (Candidate c : candList)
//				System.out.println(c);

//			LinkedHashMap<String, Integer> map = candDao.getPartywiseVotes();
//			map.forEach((k,v) -> System.out.println(k + " -- " + v));

//			System.out.print("Enter Email: ");
//			String email = sc.next();
//			System.out.print("Enter Password: ");
//			String passwd = sc.next();
//			User u = userDao.signIn(email, passwd);
//			if(u != null)
//				System.out.println("Login Success: " + u);
//			else
//				System.out.println("Login Failed");

//			Date begin = Date.valueOf("1990-01-01");
//			Date end = Date.valueOf("1991-12-31");
//			List<User> list = userDao.getUserDetails(begin, end);
//			for (User u : list)
//				System.out.println(u);

//			String msg = userDao.updateVotingStatus(3);
//			System.out.println(msg);

//			System.out.print("Enter First Name: ");
//			String fname = sc.next();
//			System.out.print("Enter Last Name: ");
//			String lname = sc.next();
//			System.out.print("Enter Email: ");
//			String email = sc.next();
//			System.out.print("Enter Password: ");
//			String passwd = sc.next();
//			System.out.print("Enter BirthDate (yyyy-mm-dd): ");
//			String dob = sc.next();
//			User user = new User(0, fname, lname, email, passwd, Date.valueOf(dob), false, "voter");
//			String msg = userDao.voterRegistration(user);
//			System.out.println(msg);
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			userDao.cleanUp();
			candDao.cleanUp();
			DbUtil.closeConnection();
		}
	}
}
