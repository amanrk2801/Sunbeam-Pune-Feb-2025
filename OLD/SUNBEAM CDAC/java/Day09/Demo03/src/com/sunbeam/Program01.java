package com.sunbeam;

import java.util.Scanner;

public class Program01 {

	public static void main(String[] args) {
		int choice;
		do {
			System.out.println("0. EXIT");
			System.out.println("1. Addition");
			System.out.println("2. Substraction");
			System.out.println("3. Multiplication");
			System.out.println("Enter the choice - ");
			choice = new Scanner(System.in).nextInt();
			switch (choice) {
			case 0:
				System.out.println("Bye..");
				break;
			case 1:
				System.out.println("Addition");
				break;
			case 2:
				System.out.println("Substraction");
				break;
			case 3:
				System.out.println("Multiplication");
				break;
			default:
				System.out.println("Wrong choice");
				break;
			}
		} while (choice != 0);
	}

}
