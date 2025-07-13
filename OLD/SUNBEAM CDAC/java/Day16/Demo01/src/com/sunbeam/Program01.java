package com.sunbeam;

import java.util.Scanner;

class Circle implements Shape {
	private int radius;

	@Override
	public void accept(Scanner sc) {
		System.out.print("Enter radius - ");
		radius = sc.nextInt();
	}

	@Override
	public void calculateArea() {
		System.out.println("Area of Circle - " + (3.14 * radius * radius));
	}

}

class Rectangle implements Shape {
	private int length;
	private int breadth;

	@Override
	public void accept(Scanner sc) {
		System.out.print("Enter length and breadth - ");
		length = sc.nextInt();
		breadth = sc.nextInt();
	}

	@Override
	public void calculateArea() {
		System.out.println("Area of Rectangle - " + (length * breadth));
	}

	@Override
	public void calculatePerimeter() {
		System.out.println("Perimeter of Rectangle - "+(2*(length+breadth)));
	}
}

class Square implements Shape{

	@Override
	public void accept(Scanner sc) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void calculateArea() {
		// TODO Auto-generated method stub
		
	}
	
}

public class Program01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		Shape shape = null;
		do {
			System.out.println("0. Exit");
			System.out.println("1. Area of Rectnagle");
			System.out.println("2. Area of Circle");
			System.out.println("3. Area of Square");
			System.out.print("Enter the choice - ");
			choice = sc.nextInt();

			switch (choice) {
			case 0:
				System.out.println("Thank you for using the app..");
				break;

			case 1:
			case 2:
			case 3:
				shape = Shape.shapeFactory(choice);
				break;
				
			default:
				System.out.println("Wrong choice..");
				break;
			}
			if(shape !=null) {
				shape.accept(sc);
				shape.calculateArea();
				shape.calculatePerimeter();
				shape = null;
			}
		} while (choice != 0);
	}

}
