package com.sunbeam.p3;

public class Program01 {
	public static void printObjectArray(Object[] arr) {
		for (Object element : arr)
			System.out.println(element);
	}
	public static void main(String[] args) {
		Integer[] i1 = {10,20,30,40,50};
		printObjectArray(i1);
		
		Double[] d1 = {11.22,22.33,33.44,44.55};
		printObjectArray(d1);
		
		String [] s1 = {"sunbeam","infotech","pune", "karad"};
		printObjectArray(s1);
		
		Object [] arr = {10,12.23,"sunbeam","32.56"};
		printObjectArray(arr);
	}

}
