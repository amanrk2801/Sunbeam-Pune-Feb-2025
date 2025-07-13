package com.sunbeam.tester;

import java.sql.SQLException;
import java.util.Scanner;

import com.sunbeam.dao.StudentDao;
import com.sunbeam.entity.Student;

public class Program03 {

	public static void main(String[] args) {
		try (StudentDao studentDao = new StudentDao()) {
			try (Scanner sc = new Scanner(System.in)) {
				Student student = new Student();
				
				System.out.print("Enter marks - ");
				student.setMarks(sc.nextDouble());

				System.out.print("Enter rollno - ");
				student.setRollno(sc.nextInt());

				studentDao.updateStudent(student);
				System.out.println("Student Updated Successfully");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
