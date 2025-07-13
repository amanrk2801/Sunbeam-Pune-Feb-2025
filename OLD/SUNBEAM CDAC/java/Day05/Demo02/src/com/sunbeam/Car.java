package com.sunbeam;

import java.util.Scanner;

public class Car {
	private String carName;
	private String carNumber;

	public Car(String carName, String carNumber) {
		this.carName = carName;
		this.carNumber = carNumber;
	}

	public Car() {
	}

	public void acceptCar() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the car name - ");
		carName = sc.next();
		System.out.println("Enter car number - ");
		carNumber = sc.next();
	}
	
	public void displayCar() {
		System.out.println("Car Name - "+carName);
		System.out.println("Car Number - "+carNumber);
	}
}
