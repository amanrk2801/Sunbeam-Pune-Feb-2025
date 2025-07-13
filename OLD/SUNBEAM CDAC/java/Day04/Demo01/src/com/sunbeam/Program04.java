package com.sunbeam;

public class Program04 {

	public static void multiply(int n1, int n2) {
		System.out.println("Multiplication - "+(n1*n2));
	}

	// no of paramaters are different
	public static void multiply(int n1, int n2,int n3) {
		System.out.println("Multiplication - "+(n1*n2*n3));
	}
	
	public static void square(int n1) {
		System.out.println("Square - "+(n1*n1));
	}
	
	// type of parameter is different
	public static void square(double n1) {
		System.out.println("Square - "+(n1*n1));
	}
	
	public static void division(int n1, double n2) {
		System.out.println("Division - "+(n1/n2));
	}
	
	// no and type of  parameters are same with their orders changed
	public static void division(double n1, int n2) {
		System.out.println("Division - "+(n1/n2));
	}

	public static void main(String[] args) {		
		multiply(10, 12);
		multiply(10, 12, 13);
		
		square(7);
		square(10.12);
		
		division(10, 2.5);
		division(12.5, 3);
	}

}
