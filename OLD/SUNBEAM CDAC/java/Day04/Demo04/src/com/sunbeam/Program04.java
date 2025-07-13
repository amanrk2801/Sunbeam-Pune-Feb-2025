package com.sunbeam;

import java.util.Arrays;

public class Program04 {

	public static void main(String[] args) {
		int arr[] = {44,22,11,55,33};
		
		System.out.println("Before Sorting -->");
		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr);
		System.out.println("After Sorting -->");
		System.out.println(Arrays.toString(arr));
	}

}
