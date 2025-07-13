package com.sunbeam;

import java.util.Arrays;
import java.util.Comparator;

public class Program04 {

	public static void main(String[] args) {
		Employee[] arr = { new Employee(5, "Mukesh", 9000, "SALES"), new Employee(1, "Anil", 2000, "ACC"),
				new Employee(3, "Sham", 7000, "DEV"), new Employee(2, "Akash", 4000, "SALES"),
				new Employee(4, "Yash", 5000, "DEV") };

		System.out.println("Before Sorting -->");
		for (Employee employee : arr)
			System.out.println(employee);

		class EmployeeDeptSalComparator implements Comparator<Employee>{
			@Override
			public int compare(Employee o1, Employee o2) {
				 int diff = o1.deptName.compareTo(o2.deptName);
				 if(diff==0)
					 diff = Double.compare(o1.salary, o2.salary);
				 return diff;
			}
		}
		
		EmployeeDeptSalComparator deptSalComparator = new EmployeeDeptSalComparator();
		
		Arrays.sort(arr, deptSalComparator);
		
		// sorting is done based on deptname and sal of the employees
		System.out.println("After Sorting on deptname and sal-->");
		for (Employee employee : arr)
			System.out.println(employee);

	}

}
