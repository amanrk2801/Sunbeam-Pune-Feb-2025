package com.sunbeam;

import java.util.ArrayList;
import java.util.Stack;

public class Program05 {
	public static void main(String[] args) {
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		a1.add(50);
		
		a1.set(2,300);
		
		System.out.println("Size - "+a1.size());		

		for (Integer element : a1) 
			System.out.println(element);

	}
	
}
