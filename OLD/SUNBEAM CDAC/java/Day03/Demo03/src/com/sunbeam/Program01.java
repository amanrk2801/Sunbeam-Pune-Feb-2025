package com.sunbeam;

// Single dimensional Primitive type of Array
public class Program01 {

	public static void main(String[] args) {
//		int *ptr = new int[5];
//		int arr[] = new int[5];
		int[] arr = new int[5];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		
		// for-loop
		System.out.println("Using for-loop -->");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+", ");
		}
		System.out.println(); // to go on next line in output
		
		// for-each
		System.out.println("Using for-each -->");
		for(int element : arr) {
			System.out.print(element+", ");
		}
	}
	// TODO - If the array contains 30 then change the value to 300
	// try using for-loop and for-each loop

}
