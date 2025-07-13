package com.sunbeam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Program03 {

	public static void main(String[] args) {
		final String URL = "jdbc:mysql://localhost:3306/dac_db";
		final String USERNAME = "root";
		final String PASSWORD = "root";

		try {
			Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			
			String sql = "SELECT * FROM student WHERE marks > ?";
			
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			
			double marks;
			System.out.print("Enter marks to fetch the students - ");
			marks = new Scanner(System.in).nextDouble();
			
			preparedStatement.setDouble(1, marks);
			
			ResultSet rs = preparedStatement.executeQuery();

			while (rs.next()) {
				System.out.print(rs.getInt(1) + " - ");
				System.out.print(rs.getDouble(3) + " - ");
				System.out.print(rs.getString(2));
				System.out.println();
			}
			
			preparedStatement.close();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
