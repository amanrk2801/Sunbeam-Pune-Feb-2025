package com.sunbeam;

import com.sunbeam.daos.UserDao;
import com.sunbeam.daos.UserDaoImpl;
import com.sunbeam.entities.User;

public class JdbcMain {
	public static void main(String[] args) {
		try(UserDao userDao = new UserDaoImpl()) {
			User u = userDao.findByEmail("rama@gmail.com1");
			if(u != null)
				System.out.println("Found: " + u);
			else
				System.out.println("User Not Found");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
