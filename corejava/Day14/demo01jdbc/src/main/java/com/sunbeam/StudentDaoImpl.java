package com.sunbeam;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements AutoCloseable,StudentDao {
	
	private Connection con; 
	
	public StudentDaoImpl() throws Exception {
		con = Dbutil.getConnection(); 
	}
	
	@Override
	public void close()  {
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
	@Override
	public Student findByID(int roll) throws Exception {
		String sql = "SELECT * FROM students WHERE roll = ?"; 
		PreparedStatement stmt = con.prepareStatement(sql); 
		stmt.setInt(1, roll);
		try(ResultSet rs = stmt.executeQuery()){
			if(rs.next()) {
				int rollNumber = rs.getInt("roll"); 
				String name = rs.getString("name"); 
				double marks = rs.getDouble("marks"); 
				Student s = new Student(rollNumber, name, marks); 
				return s; 
			}
		}
		return null;
	}

	@Override
	public List<Student> findAll() throws Exception {
		List<Student> list = new ArrayList<Student>(); 
		String sql = "SELECT * FROM students"; 
		PreparedStatement stmt = con.prepareStatement(sql);  
		try(ResultSet rs = stmt.executeQuery()){
			while(rs.next()) {
				int rollNumber = rs.getInt("roll"); 
				String name = rs.getString("name"); 
				double marks = rs.getDouble("marks"); 
				Student s = new Student(rollNumber, name, marks);
				list.add(s); 
			}
		}
		return list; 
	}

	@Override
	public int save(Student s) throws Exception {
		String sql = "INSERT INTO students VALUES(?,?,?)"; 
		PreparedStatement stmt = con.prepareStatement(sql); 
		stmt.setInt(1, s.getRoll());
		stmt.setString(2, s.getName());
		stmt.setDouble(3, s.getMarks());
		int count = stmt.executeUpdate();   
		return count;
	}

	

}
