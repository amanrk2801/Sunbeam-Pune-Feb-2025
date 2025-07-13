package com.sunbeam;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Program02 {

	public static void main(String[] args) {
		//Set<Employee> empSet = new HashSet<Employee>();
		//Set<Employee> empSet = new LinkedHashSet<Employee>();
		Set<Employee> empSet = new TreeSet<Employee>();

		empSet.add(new Employee(2,"Anil",7000));
		empSet.add(new Employee(4,"Mukesh",5000));
		empSet.add(new Employee(1,"Sham",6000));
		empSet.add(new Employee(5,"Prasad",2000));
		empSet.add(new Employee(3,"Nikhil",3000));
		empSet.add(new Employee(5,"Prasad",2000));
		
		for (Employee employee : empSet)
			System.out.println(employee);
		
		Employee key = new Employee();
		key.id = 3;
		System.out.println("employee found - "+empSet.contains(key));
		
	}	

}
