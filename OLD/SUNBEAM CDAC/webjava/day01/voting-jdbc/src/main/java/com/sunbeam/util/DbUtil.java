package com.sunbeam.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {
	private static Connection con;
	
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void openConnection(String url, String user, String passwd) throws SQLException {
		con = DriverManager.getConnection(url, user, passwd);
	}
	
	public static void closeConnection() {
		try {
			if(con != null)
				con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection() {
		return con;
	}
}
