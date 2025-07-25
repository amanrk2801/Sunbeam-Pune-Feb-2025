package com.sunbeam;

import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		/* 
		try(StudentDao dao = new StudentDaoImpl()){
			Student s = dao.findByID(1); 
			System.out.println(s.toString());
		}
		catch (Exception e) {
			e.printStackTrace();
		}*/ 
		
		/* 
		try(StudentDao dao = new StudentDaoImpl()){
			List<Student> list = new ArrayList<Student>( );  
			list = dao.findAll(); 
			for (Student s : list) {
				System.out.println(s);
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}*/ 
		
		try(StudentDao dao = new StudentDaoImpl()){
			Student s = new Student(6, "Omkar", 88.88); 
			int count = dao.save(s); 
			System.out.println("Rows Affected : "+count);
		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
