package com.sunbeam;

import java.util.Scanner;

// Employee is-a Person
// Person -> Super class
// Employee -> Sub class
public class Employee extends Person{
	private int empid;
	private double salary;
	
	public Employee() {
		System.out.println("Employee()");
	}
	
	public Employee(String name, String mobile, int empid, double salary) {
		super(name,mobile);
		System.out.println("Employee(int,double)");
		this.empid = empid;
		this.salary = salary;
	}




	@Override
	public void accept(Scanner sc) {
		System.out.println("Enter empid -  ");
		empid = sc.nextInt();
		
		super.accept(sc);
		
		System.out.println("Enter salary - ");
		salary = sc.nextDouble();
	}
	
	@Override
	public void display() {
		System.out.println("Empid - "+empid);
		super.display();
		System.out.println("Salary - "+salary);
	}

}
