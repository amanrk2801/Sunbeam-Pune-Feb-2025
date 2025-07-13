package com.sunbeam;

import java.util.Scanner;

public abstract class Employee {
	private int empid;
	private String name;
	private double salary;
	
	public Employee() {
		System.out.println("Employee()");
	}
	
	public void accept(Scanner sc) {
		System.out.println("Enter empid - ");
		empid = sc.nextInt();
		System.out.println("Enter name - ");
		name = sc.next();
		System.out.println("Enter salary - ");
		salary = sc.nextDouble();
	}
	
	public double getSalary() {
		return salary;
	}
	
	public abstract void calculateTotalSalary();

	
	@Override
	public String toString() {
		return "[empid=" + empid + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
}
