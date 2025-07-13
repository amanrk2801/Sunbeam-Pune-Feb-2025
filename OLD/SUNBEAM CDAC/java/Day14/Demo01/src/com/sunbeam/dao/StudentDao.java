package com.sunbeam.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;

import com.sunbeam.entity.Student;
import com.sunbeam.util.DbUtil;

public class StudentDao implements AutoCloseable,IStudentDao {
	private Connection connection;

	public StudentDao() throws SQLException {
		connection = DbUtil.getConnection();
	}
	
	public void updateStudent(int rollno, double marks) throws SQLException {
		String sql = "CALL sp_updateStudent(?,?)";
		try(CallableStatement callableStatement = connection.prepareCall(sql)){
			callableStatement.setInt(1, rollno);
			callableStatement.setDouble(2, marks);
			callableStatement.executeUpdate();
		}
	}
	
	@Override
	public void close() throws SQLException {
		if (connection != null)
			connection.close();
	}

	@Override
	public List<Student> getAllStudents() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateStudent(Student student) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertStudent(Student student) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Student findStudent(int rollno) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteStudent(int rollno) throws SQLException {
		// TODO Auto-generated method stub
		
	}

}
