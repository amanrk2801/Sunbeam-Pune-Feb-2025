package com.sunbeam.tester;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.sunbeam.entity.Student;
import com.sunbeam.util.DbUtil;

public class Program02 {

	public static void main(String[] args) {
		try(Connection connection = DbUtil.getConnection()) {
			
			String sql = "SELECT * FROM student WHERE marks > ?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			
			System.out.println("Enter marks of the student - ");
			double marks = new Scanner(System.in).nextDouble();		
			
			preparedStatement.setDouble(1, marks);	
			ResultSet rs =  preparedStatement.executeQuery();
			Student student;
			while(rs.next()) {
				student = new Student();
				student.setRollno(rs.getInt(1));
				student.setName(rs.getString(2));
				student.setMarks(rs.getDouble(3));
				student.setMobile(rs.getString(4));
				System.out.println(student);
			}
			preparedStatement.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}

}
