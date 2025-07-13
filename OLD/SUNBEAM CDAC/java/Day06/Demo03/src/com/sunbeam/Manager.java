package com.sunbeam;

import java.util.Scanner;

public class Manager extends Employee {
	private double bonus;

	public Manager() {
		System.out.println("Manager()");
	}
	
	@Override
	public void accept(Scanner sc) {
		super.accept(sc);
		System.out.println("Enter bonus - ");
		bonus = sc.nextDouble();
	}

	@Override
	public String toString() {
		return "["+ super.toString() + ", bonus=" + bonus + "]";
	}
	
	public void calculateTotalSalary() {
		System.out.println("Total Salary - "+(getSalary()+bonus));
	}

	
}
