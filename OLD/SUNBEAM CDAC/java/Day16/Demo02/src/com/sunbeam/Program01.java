package com.sunbeam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Program01 {

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(5,"Akash",3000));
		empList.add(new Employee(1,"Nikhil",5000));
		empList.add(new Employee(2,"Anil",4000));
		empList.add(new Employee(4,"Mukesh",2000));
		empList.add(new Employee(3,"Sham",1000));
		
		// Local class
//		class EmpIdComparator implements Comparator<Employee>{	
//			@Override
//			public int compare(Employee o1, Employee o2) {
//				return o1.id-o2.id;
//			}
//		}
		
		//EmpIdComparator empIdComparator = new EmpIdComparator();
		//Collections.sort(empList,empIdComparator);

		//Comparator<Employee> cmp = new EmpIdComparator();
		//Collections.sort(empList,cmp);

		//Collections.sort(empList,new EmpIdComparator());// Anonymous objects
		
		// Anonymous Local/Inner class
//		Comparator<Employee> cmp = new Comparator<Employee>() {
//			@Override
//			public int compare(Employee o1, Employee o2) {
//				return o1.id-o2.id;
//			}
//		}; 
		
		//Collections.sort(empList,cmp);
		
		// Anonymous object Anonymous Local/Inner class
//		Collections.sort(empList, new Comparator<Employee>() {
//			@Override
//			public int compare(Employee o1, Employee o2) {
//				return o1.id-o2.id;
//			}
//		});
	
		// LamdaExpression - ShortHand Implementation of Functional Interface 
		Collections.sort(empList,(o1,o2)-> o1.id-o2.id);
		
		
		for (Employee employee : empList)
			System.out.println(employee);
	}

}
