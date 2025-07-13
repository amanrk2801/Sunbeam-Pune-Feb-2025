package com.sunbeam.p1;

import java.util.Scanner;

public class Program01 {

	public static void main1(String[] args) {
		ArithmeticOperations[] arr = ArithmeticOperations.values();
		for(ArithmeticOperations element: arr) {
			System.out.println(element.ordinal() + " - "+element);
		}
	}
	
	public static void main(String[] args) {
		int choice;
		do {
			ArithmeticOperations[] arr = ArithmeticOperations.values();
			for(ArithmeticOperations element: arr)
				System.out.println(element.ordinal() + ". "+element);
			
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
