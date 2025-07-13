package com.sunbeam;

import java.util.Scanner;

public class Program07 {

	public static void division(int numerator, int denominator) {
		System.out.println("Division - " + (numerator / denominator));
	}

	public static void main(String[] args) {
				
		try(Scanner sc = new Scanner(System.in))// try with resource 
		{
			System.out.println("Enter value for numerator - ");
			int numerator = sc.nextInt();
			System.out.println("Enter value for denominator - ");
			int denominator = sc.nextInt();
			division(numerator,denominator);
		}
		System.out.println("Program Finished Successfully");
	}

}
