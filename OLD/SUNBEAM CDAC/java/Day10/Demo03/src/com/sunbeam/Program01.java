package com.sunbeam;

import java.util.Arrays;

public class Program01 {

	public static void main(String[] args) {
		Employee[] arr = {
				new Employee(4,"Anil",6000),
				new Employee(2,"Mukesh",3000),
				new Employee(5, "Sham",5000),
				new Employee(1,"Nikhil", 9000),
				new Employee(3, "Akash",7000) };
	
		System.out.println("Before sorting --> ");
		for (Employee employee : arr)
			System.out.println(employee);
		
		Arrays.sort(arr);
		
		System.out.println("After sorting --> ");
		for (Employee employee : arr)
			System.out.println(employee);
		
		Comparable<Employee> c1 = new Employee(); // upcasting?
	}
	
	
	

}
