package com.sunbeam.daos;

import java.util.List;

import com.sunbeam.entities.User;

public interface UserDao extends AutoCloseable {
	User findByEmail(String email) throws Exception;
//	List<User> findAll();
//	int save(User u);
//	int update(User u);
//	int deleteById(int userId);
}
