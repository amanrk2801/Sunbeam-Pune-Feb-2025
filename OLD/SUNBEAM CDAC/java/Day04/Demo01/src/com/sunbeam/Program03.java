package com.sunbeam;

public class Program03 {

	// Variable Arity Method
	public static void add(int ...arr) {
		int result = 0;
		for (int element : arr)
			result += element;
		System.out.println("Addition = " + result);
	}

	public static void main(String[] args) {		
		add(10,20,30);
		
		add(10,20,30,40);
		
		add(10,20,30,40,50);

	}

}
