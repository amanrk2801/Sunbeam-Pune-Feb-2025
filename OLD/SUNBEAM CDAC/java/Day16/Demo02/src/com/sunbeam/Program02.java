package com.sunbeam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class Program02 {

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(5, "Akash", 3000));
		empList.add(new Employee(1, "Nikhil", 5000));
		empList.add(new Employee(2, "Anil", 4000));
		empList.add(new Employee(4, "Mukesh", 2000));
		empList.add(new Employee(3, "Sham", 1000));

		// Collections.sort(empList,(o1,o2)-> o1.id-o2.id);

		// Collections.sort(empList,(o1,o2)-> o1.name.compareTo(o2.name));

		Collections.sort(empList, (o1, o2) -> Double.compare(o1.salary, o2.salary));

//		for (Employee employee : empList)
//		System.out.println(employee);

//		class PrintEmployee implements Consumer<Employee> {
//			@Override
//			public void accept(Employee t) {
//				System.out.println(t);
//			}
//		}
//		PrintEmployee p1 = new PrintEmployee();
//		empList.forEach(p1);
		
		empList.forEach(e -> System.out.println(e));

	}

}
