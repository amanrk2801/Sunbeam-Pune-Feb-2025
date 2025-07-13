package com.sunbeam;

public class Program02 {
	public static void method1() {
		int num1;
		double num2;
		long num3;
		method1();
	}

	// This program is going to crash
	// It will throw an Error StackOverflowError
	public static void main(String[] args) {
		method1();
	}

}
