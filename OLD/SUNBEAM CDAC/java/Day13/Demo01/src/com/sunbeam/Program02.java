package com.sunbeam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Program02 {

	public static void main(String[] args) {
		final String URL = "jdbc:mysql://localhost:3306/dac_db";
		final String USERNAME = "root";
		final String PASSWORD = "root";

		try {
			Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			Statement statement = connection.createStatement();
			String sql = "SELECT * FROM student WHERE marks>50";
			ResultSet rs = statement.executeQuery(sql);
			while (rs.next()) {
				System.out.print(rs.getInt(1) + " - ");
				System.out.print(rs.getDouble(3) + " - ");
				System.out.print(rs.getString(2));
				System.out.println();
			}
			
			statement.close();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
