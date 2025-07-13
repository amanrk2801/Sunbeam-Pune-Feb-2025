package com.sunbeam;

import java.util.ArrayDeque;
import java.util.Queue;

public class Program01 {

	public static void main(String[] args) {
		Queue<Integer> q1 = new ArrayDeque<Integer>();
		q1.add(10);
		q1.add(20);
		q1.add(30);
		q1.add(40);
		
		
		System.out.println("Before removing element = "+q1.element());
		
		System.out.println("Element removed = "+q1.remove());
		
		System.out.println("After removing element = "+q1.element());
	}

}
