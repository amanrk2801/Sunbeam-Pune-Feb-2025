package com.sunbeam.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.sunbeam.util.DbUtil;

public class AccountDao implements AutoCloseable {
	private Connection connection;

	public AccountDao() throws SQLException {
		connection = DbUtil.getConnection();
	}

	public void doTransaction(int senderId, int receiverId, double amount) throws SQLException {
		String sql = "UPDATE accounts SET balance = balance + ? WHERE id = ?";
		connection.setAutoCommit(false); // START TRANSACTION;
		try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
			
			preparedStatement.setDouble(1, -amount);
			preparedStatement.setInt(2, senderId);
			int cnt1 = preparedStatement.executeUpdate();

			preparedStatement.setDouble(1, amount);
			preparedStatement.setInt(2, receiverId);
			int cnt2 = preparedStatement.executeUpdate();

			if (cnt1 == 0 || cnt2 == 0)
				throw new RuntimeException("bank server not responding...");
			
			connection.commit();
		
		}catch (RuntimeException e) {
			connection.rollback();
		}
		
	}

	@Override
	public void close() throws SQLException{
		if (connection != null)
			connection.close();
	}

}
