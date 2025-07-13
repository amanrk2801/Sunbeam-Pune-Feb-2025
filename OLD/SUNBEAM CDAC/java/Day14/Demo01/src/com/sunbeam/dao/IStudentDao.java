package com.sunbeam.dao;

import java.sql.SQLException;
import java.util.List;

import com.sunbeam.entity.Student;


public interface IStudentDao {
	
	List<Student> getAllStudents() throws SQLException;
	
	void updateStudent(Student student)throws SQLException;
	
	void insertStudent(Student student)throws SQLException;
	
	Student findStudent(int rollno)throws SQLException;
	
	void deleteStudent(int rollno)throws SQLException;
	
}
