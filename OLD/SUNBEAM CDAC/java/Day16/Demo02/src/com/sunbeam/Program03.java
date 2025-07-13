package com.sunbeam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class Program03 {

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(5, "Akash", 3000));
		empList.add(new Employee(1, "Nikhil", 5000));
		empList.add(new Employee(2, "Anil", 4000));
		empList.add(new Employee(4, "Mukesh", 2000));
		empList.add(new Employee(3, "Sham", 1000));

		System.out.println("Employes sorted on empid -->");
		Collections.sort(empList,(e1,e2)-> e1.id-e2.id);
		empList.forEach(e -> System.out.println(e));
		
		System.out.println();
		System.out.println("Employes sorted on Name -->");
		Collections.sort(empList,(e1,e2)-> e1.name.compareTo(e2.name));
		empList.forEach(e-> System.out.println(e));
		
		System.out.println();
		System.out.println("Employes sorted on salary in desc -->");
		Collections.sort(empList,(e1,e2)->Double.compare(e2.salary, e1.salary));
		empList.forEach(e->System.out.println(e));
	}

}
