package com.sunbeam;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Stack;

public class Program07 {
	public static void main(String[] args) {
		ArrayList<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(3,"Anil",5000));
		empList.add(new Employee(2,"Mukesh",4000));
		empList.add(new Employee(1,"Sham",2000));
		
		System.out.println("Before sort -->");
		for (Employee employee : empList) {
			System.out.println(employee);
		}
		
		class EmployeeSalComparator implements Comparator<Employee>{
			@Override
			public int compare(Employee o1, Employee o2) {
				return Double.compare(o1.salary, o2.salary);
			}
		}
		
		empList.sort(new EmployeeSalComparator());
		
		System.out.println("After sort -->");
		for (Employee employee : empList) {
			System.out.println(employee);
		}
		
	}
	
}
