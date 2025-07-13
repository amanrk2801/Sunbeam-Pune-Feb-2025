package com.sunbeam.p3;

public class Program02 {
	
	public static <T>void printTypeArray(T[] arr) {
		for (T element : arr)
			System.out.println(element);
		
	}
	
	public static void main(String[] args) {
		Integer []i1 = {10,20,30,40,50};
		printTypeArray(i1);
		
		String [] s1 = {"sunbeam","pune", "karad"};
		printTypeArray(s1);
		
		Double[] d1 = {11.22,22.33,33.44,44.55};
		Program02.<Double>printTypeArray(d1);
		//Program02.<Double>printTypeArray(s1); compiler error
		
		Object [] arr = {10,12.23,"sunbeam","32.56"};
		//Program02.<String>printTypeArray(arr); // compiler error
		
	}

}
