package com.sunbeam;

public class Program01 {

	public static void division(int numerator, int denominator) {
		System.out.println("Division - " + (numerator / denominator));
	}

	public static void main(String[] args) {
		try {
			division(10, 0);
		} catch (ArithmeticException e) {
			System.out.println("Denominator cannot be 0");
			System.out.println(e.getMessage());
			e.printStackTrace();
			
		}
		System.out.println("Program Finished Successfully");
	}

}
