package com.sunbeam;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program04 {

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
		} catch (Exception e)// Generic Catch Block 
		{
			e.printStackTrace();
		}
		System.out.println("Program Finished Successfully");
	}

}
