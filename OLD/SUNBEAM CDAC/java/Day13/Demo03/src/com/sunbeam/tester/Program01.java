package com.sunbeam.tester;

import java.sql.SQLException;
import java.util.List;

import com.sunbeam.dao.StudentDao;
import com.sunbeam.entity.Student;

public class Program01 {

	public static void main(String[] args) {
		try(StudentDao studentDao = new StudentDao()){
			List<Student> studentsList = studentDao.getAllStudents();
			for (Student student : studentsList)
					System.out.println(student);
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
