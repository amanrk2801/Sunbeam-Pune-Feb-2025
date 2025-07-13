package com.sunbeam;

public class Program01 {

	public static void main(String[] args) {
		// we can declare local variables as final
		// In java, initializing the final varaibles at the time of 
		// declaration is optional
		final int num1;
		// final varaibles once initialized we cannot change its value
		num1 = 10;
		// num1 = 20; // NOT OK
		System.out.println(num1);
		
		int num2 = 20; // effectively final
		// if num2 varaible value is never changed in the method once
		// it is initialized then it is considerd as effectively final variable
		System.out.println(num2);
	}

}
