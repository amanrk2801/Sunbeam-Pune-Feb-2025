package com.sunbeam;

import java.util.Arrays;
import java.util.Comparator;

public class Program01 {

	public static void main(String[] args) {
		Employee[] arr = { new Employee(5, "Mukesh", 9000, "SALES"), new Employee(1, "Anil", 2000, "ACC"),
				new Employee(3, "Sham", 7000, "DEV"), new Employee(2, "Akash", 4000, "SALES"),
				new Employee(4, "Yash", 5000, "DEV") };

		System.out.println("Before Sorting -->");
		for (Employee employee : arr)
			System.out.println(employee);

		Arrays.sort(arr);

		// sorting is done based on natural ordering of the elements
		System.out.println("After Sorting -->");
		for (Employee employee : arr)
			System.out.println(employee);

		// helper class for employee to compare the names
		class EmployeeNameComparator implements Comparator<Employee> {
			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.name.compareTo(o2.name);
			}
		}
		
		EmployeeNameComparator nameComparator = new EmployeeNameComparator();

		Arrays.sort(arr, nameComparator);
		// sorting is done based on name of the employees
		System.out.println("After Sorting on names -->");
		for (Employee employee : arr)
			System.out.println(employee);

	}

}
