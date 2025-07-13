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
	
	public void acceptEmployee(Scanner sc) {
		System.out.println("Enter empid -  ");
		empid = sc.nextInt();
		
		this.acceptPerson(sc);
		
		System.out.println("Enter salary - ");
		salary = sc.nextDouble();
	}
	
	public void displayEmployee() {
		System.out.println("Empid - "+empid);
		
		this.displayPerson();
		
		System.out.println("Salary - "+salary);
	}
}
