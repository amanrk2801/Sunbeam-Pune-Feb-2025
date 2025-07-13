package com.sunbeam;

public class Program02 {

	public static void add(int[] arr) {
		int result = 0;
		for (int element : arr)
			result += element;
		System.out.println("Addition = " + result);
	}

	public static void main(String[] args) {
//		int []arr = new int[] {10,20,30};
		
		int[] arr1 = { 10, 20, 30 };
		add(arr1);
		
		int[] arr2 = { 10, 20, 30, 40 };
		add(arr2);
		
		int[] arr3 = { 10, 20, 30, 40,50 };
		add(arr3);

	}

}
