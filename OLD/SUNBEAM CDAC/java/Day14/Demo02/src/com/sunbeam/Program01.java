package com.sunbeam;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

class Employee{
	private int empid;
	protected double salary;
	String name;
	
	public Employee() {
	}

	public Employee(int empid, double salary, String name) {
		this.empid = empid;
		this.salary = salary;
		this.name = name;
	}
	
	public void acceptData() {
		
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", salary=" + salary + ", name=" + name + "]";
	}
}

public class Program01 {

	public static void main(String[] args) throws ClassNotFoundException {
//		Class c1 = Class.forName("java.lang.String");
//		Class c1 = Class.forName("java.util.Date");
		
//		Class c1 = Employee.class;
		
		Employee e = new Employee();
		Class c1 = e.getClass();
		
		// Method []arr1 = c1.getMethods();
		Method[] arr1 = c1.getDeclaredMethods();
		for (Method element : arr1)
			System.out.println(element);

		System.out.println("----------------------------------------");

		Field[] arr2 = c1.getDeclaredFields();
		for (Field element : arr2)
			System.out.println(element);

		System.out.println("----------------------------------------");

		Constructor[] arr3 = c1.getDeclaredConstructors();
		for (Constructor element : arr3)
			System.out.println(element);
		
		System.out.println("----------------------------------------");
		Class c2 = c1.getSuperclass();
		System.out.println("super class - "+c2);
		
		System.out.println("----------------------------------------");
		Class[] arr4 = c1.getInterfaces();
		for(Class element : arr4)
			System.out.println(element);
	}	

}
