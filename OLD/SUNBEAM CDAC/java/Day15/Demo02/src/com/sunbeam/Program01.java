package com.sunbeam;

import java.util.Scanner;

interface Shape {
	void accept(Scanner sc);
	void calculateArea();
	default void calculatePerimeter() {
		// no implementation
		// empty method
	}
	
}

class Rectangle implements Shape {

	@Override
	public void accept(Scanner sc) {
		System.out.println("Rectangle accept");
	}

	@Override
	public void calculateArea() {
		System.out.println("Area of Rectangle");
	}
	
	@Override
	public void calculatePerimeter() {
		System.out.println("Rectangle Perimeter");
	}

}

class Circle implements Shape {

	@Override
	public void accept(Scanner sc) {
		System.out.println("Circle accept");
	}

	@Override
	public void calculateArea() {
		System.out.println("Area of circle");
	}

}

public class Program01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Shape shape = null;
		int choice;
		do {
			System.out.println("0.Exit");
			System.out.println("1.Circle");
			System.out.println("2.Rectangle");
			System.out.println("Enter choice - ");
			choice = sc.nextInt();
			switch (choice) {
			case 0:
				System.out.println("Bye...");
				break;
			case 1:
				shape = new Circle();
				break;
			case 2:
				shape = new Rectangle();
				break;
			default:
				System.out.println("Wrong choice...");
				break;
			}
			if(shape!=null) {
				shape.accept(sc);
				shape.calculateArea();
				shape.calculatePerimeter();
				shape=null;
			}

		} while (choice != 0);
	}

}
