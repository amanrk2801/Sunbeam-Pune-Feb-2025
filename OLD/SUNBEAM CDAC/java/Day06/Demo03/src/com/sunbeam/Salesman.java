package com.sunbeam;

import java.util.Scanner;

public class Salesman extends Employee {
	private double commission;
	private int noOfSales;

	public Salesman() {
		System.out.println("Salesman()");
	}
	
	@Override
	public void accept(Scanner sc) {
		super.accept(sc);
		System.out.println("Enter the commission - ");
		commission = sc.nextDouble();
		System.out.println("Enter no of sales done - ");
		noOfSales = sc.nextInt();
	}

	@Override
	public String toString() {
		return "[" + super.toString() + ", commission=" + commission + ", noOfSales=" + noOfSales + "]";
	}

	@Override
	public void calculateTotalSalary() {
		double total = getSalary() + (commission * noOfSales);
		System.out.println("Total salary of salesman - "+total);

	}

}
