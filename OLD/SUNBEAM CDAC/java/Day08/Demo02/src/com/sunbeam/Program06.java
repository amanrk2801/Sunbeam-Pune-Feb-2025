package com.sunbeam;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program06 {

	public static void division(int numerator, int denominator) {
		System.out.println("Division - " + (numerator / denominator));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		try {
			System.out.println("Enter value for numerator - ");
			int numerator = sc.nextInt();
			System.out.println("Enter value for denominator - ");
			int denominator = sc.nextInt();
			division(numerator,denominator);
		}finally {
			// finally block is used to close the resources 
			// it will execute even if their are no any exception
			// or their are exceptions
			System.out.println("Inside Finally Block");
			sc.close(); // close the resource
		} 
		System.out.println("Program Finished Successfully");
	}

}
