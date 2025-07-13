package com.sunbeam.tester;

import java.sql.SQLException;
import java.util.Scanner;

import com.sunbeam.dao.StudentDao;
import com.sunbeam.entity.Student;

public class Program05 {

	public static void main(String[] args) {
		try (StudentDao studentDao = new StudentDao()) {
			try (Scanner sc = new Scanner(System.in)) {

				System.out.print("Enter rollno - ");
				int rollno = sc.nextInt();

				Student student = studentDao.findStudent(rollno);
				if (student != null)
					System.out.println(student);
				else
					System.out.println("Student not found..");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
