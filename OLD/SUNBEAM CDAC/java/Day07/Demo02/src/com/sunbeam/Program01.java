package com.sunbeam;

import java.util.Scanner;

public class Program01 {

	public static int menu(Scanner sc) {
		System.out.println("0. EXIT");
		System.out.println("1. Circle");
		System.out.println("2. Rectangle");
		System.out.print("Enter the choice - ");
		return sc.nextInt();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		// object of interface cannot be created only reference can be created
		Shape shape = null; 
		while ((choice = menu(sc)) != 0) {
			switch (choice) {
			case 1:
				shape = new Circle(); // upcasting
				break;

			case 2:
				shape = new Rectangle();// upcasting
				break;

			default:
				System.out.println("Wrong choice..");
				break;
			}
			if(shape!=null) {
				shape.accept(sc);
				shape.calculateArea();
				shape = null;
			}
		}

		sc.close();

	}

}
