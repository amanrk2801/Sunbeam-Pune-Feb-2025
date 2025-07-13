package com.sunbeam;

import java.util.Scanner;

// Employee has-a doj (Composition)
// Employee has-a car (Aggegration)

public class Employee {
	private int empid;
	private String name;
	private double salary;
	private Date doj; // Association-> Composition
	private Car car;// Association -> Aggegartion

	public Employee() {
		doj = new Date();
	}

	public Employee(int empid, String name, double salary, int day, int month, int year) {
		this.empid = empid;
		this.name = name;
		this.salary = salary;
		this.doj = new Date(day, month, year);
	}

	public void acceptEmploye() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Empid - ");
		empid = sc.nextInt();
		System.out.println("Enter name- ");
		name = sc.next();
		System.out.println("Enter salary- ");
		salary = sc.nextDouble();
		doj.acceptDate();
	}

	public void displayEmployee() {
		System.out.println("Empid - " + empid);
		System.out.println("Name - " + name);
		System.out.println("Salary - " + salary);
		System.out.println("Date of joining - " + doj.getDate());
		if (car != null)
			car.displayCar();
	}

	public void setCar(Car car) {
		this.car = car;
	}

}
