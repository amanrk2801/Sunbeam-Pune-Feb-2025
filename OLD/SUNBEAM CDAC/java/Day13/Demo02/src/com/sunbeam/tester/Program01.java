package com.sunbeam.tester;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.sunbeam.entity.Student;
import com.sunbeam.util.DbUtil;

public class Program01 {

	public static void main(String[] args) {
		try {
			Connection connection = DbUtil.getConnection();
			String sql = "SELECT * FROM student";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet rs =  preparedStatement.executeQuery();
		
			while(rs.next()) {
				Student student = new Student();
				student.setRollno(rs.getInt(1));
				student.setName(rs.getString(2));
				student.setMarks(rs.getDouble(3));
				student.setMobile(rs.getString(4));
				
				System.out.println(student);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}

}
