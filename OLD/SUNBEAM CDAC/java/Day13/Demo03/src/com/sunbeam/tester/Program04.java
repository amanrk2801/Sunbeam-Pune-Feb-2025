package com.sunbeam.tester;

import java.sql.SQLException;
import java.util.Scanner;

import com.sunbeam.dao.StudentDao;
import com.sunbeam.entity.Student;

public class Program04 {

	public static void main(String[] args) {
		try (StudentDao studentDao = new StudentDao()) {
			try (Scanner sc = new Scanner(System.in)) {
				
				System.out.print("Enter rollno - ");
				int rollno = sc.nextInt();

				studentDao.deleteStudent(rollno);
				System.out.println("Student Deleted Successfully");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
