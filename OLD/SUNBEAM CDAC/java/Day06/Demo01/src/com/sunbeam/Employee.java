package com.sunbeam;

import java.util.Scanner;

public class Employee extends Person {
	private int empid;
	private double salary;
	
	public Employee() {
	}
	
	@Override
	public void accept(Scanner sc) {
		System.out.println("Enter empid - ");
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
	
	void calculateTax() {
		System.out.println("Tax Payable - "+(salary*0.1));
	}
	
}
