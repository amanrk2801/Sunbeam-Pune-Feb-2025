package com.sunbeam;

import java.util.Scanner;

public class Program02 {

	public static void main1(String[] args) {
		ArithmeticOperations[] arr = ArithmeticOperations.values();
		//ArithmeticOperations obj = arr[1];
		for(ArithmeticOperations element: arr) {
			System.out.println(element.ordinal() + " - "+element);
		}
	}
	
	public static void main(String[] args) {
		int choice;
		do {
			System.out.println("0. EXIT");
			System.out.println("1. Addition");
			System.out.println("2. Substraction");
			System.out.println("3. Multiplication");
			System.out.println("Enter the choice - ");
			choice = new Scanner(System.in).nextInt();
			ArithmeticOperations obj = ArithmeticOperations.values()[choice];
			switch (obj) {
			case EXIT:
				System.out.println("Bye..");
				break;
			case ADD:
				System.out.println("Addition");
				break;
			case SUB:
				System.out.println("Substraction");
				break;
			case MUL:
				System.out.println("Multiplication");
				break;
			default:
				System.out.println("Wrong choice");
				break;
			}
		} while (choice != 0);
	}

}
