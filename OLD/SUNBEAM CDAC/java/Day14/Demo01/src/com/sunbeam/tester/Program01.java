package com.sunbeam.tester;

import java.sql.SQLException;
import java.util.Scanner;

import com.sunbeam.dao.StudentDao;

public class Program01 {

	public static void main(String[] args) {
		try (StudentDao studentDao = new StudentDao()) {
			try (Scanner sc = new Scanner(System.in)) {
				System.out.println("Enter roll no to update marks - ");
				int rollno = sc.nextInt();
				System.out.println("Enter new marks - ");
				double marks = sc.nextDouble();
				
				studentDao.updateStudent(rollno, marks);
				System.out.println("Student updated successfully...");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
