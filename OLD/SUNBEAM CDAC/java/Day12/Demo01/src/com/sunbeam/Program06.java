package com.sunbeam;

import java.util.ArrayList;
import java.util.Stack;

public class Program06 {
	public static void main(String[] args) {
		ArrayList<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(1,"Anil",3000));
		empList.add(new Employee(2,"Mukesh",4000));
		empList.add(new Employee(3,"Sham",5000));
		
		for (Employee employee : empList) {
			System.out.println(employee);
		}
		
		System.out.println("employee at index 2 - "+empList.get(2));
		
		Employee key = new Employee();
		key.id = 3;
		System.out.println("index of emp with id 2 = "+ empList.indexOf(key));
	
		empList.set(2, key);
		
		for (Employee employee : empList) {
			System.out.println(employee);
		}
		
	}
	
}
