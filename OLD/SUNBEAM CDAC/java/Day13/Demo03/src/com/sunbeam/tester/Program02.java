package com.sunbeam.tester;

import java.sql.SQLException;
import java.util.Scanner;

import com.sunbeam.dao.StudentDao;
import com.sunbeam.entity.Student;

public class Program02 {

	public static void main(String[] args) {
		try (StudentDao studentDao = new StudentDao()) {
			try (Scanner sc = new Scanner(System.in)) {
				Student student = new Student();
				System.out.print("Enter name - ");
				student.setName(sc.next());
				System.out.print("Enter marks - ");
				student.setMarks(sc.nextDouble());
				System.out.print("Enter mobile - ");
				student.setMobile(sc.next());
				
				studentDao.insertStudent(student);
				System.out.println("Student Added Successfully");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
