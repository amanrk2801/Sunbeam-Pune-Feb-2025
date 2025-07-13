package com.sunbeam;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Program05 {

	public static void main(String[] args) {
		Collection<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(3,"Anil",4000));
		empList.add(new Employee(2,"Mukesh",3000));
		empList.add(new Employee(1,"Sham",2000));
		empList.add(new Employee(5,"Akash",1000));
		empList.add(new Employee(4,"Prasad",5000));
		
		for (Employee employee : empList)
			System.out.println(employee);
		
		Employee key = new Employee();
		key.id = 3;
		System.out.println("emp found - "+empList.contains(key));
	
		System.out.println("emp removed - "+empList.remove(key));
	
		for (Employee employee : empList)
			System.out.println(employee);
		
		List<Employee> l1 =(List<Employee>) empList;
		Collections.sort(l1);
		
		System.out.println("After sorting --> ");
		for (Employee employee : empList)
			System.out.println(employee);
	}

}
