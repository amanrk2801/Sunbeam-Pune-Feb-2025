package com.sunbeam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Program {
	public static void main(String[] args) {
		try {
			// get object of Connection by providing the url, username and password.
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dac_db","root","root");
			
			// Write a Sql query and keep it inside String object;
			String sql = "SELECT * FROM student";
	
			// Cretae the object of statement by using the connection object
			Statement stmt = con.createStatement();
			
			// Execute the query by calling the method from the Statement executeQuery(sql)
			// this returns an object of the ResultSet
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()) 
				System.out.println(rs.getString(2)+" - "+rs.getDouble("marks"));
			
			stmt.close();
			con.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
