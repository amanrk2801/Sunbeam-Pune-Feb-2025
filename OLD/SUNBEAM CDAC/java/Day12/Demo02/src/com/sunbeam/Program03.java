package com.sunbeam;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class Program03 {

	// Behaviour of the stack
	public static void main(String[] args) {
		Deque<Integer> q1 = new ArrayDeque<Integer>();
		q1.addFirst(10);
		q1.addFirst(20);
		q1.addFirst(30);
		q1.addFirst(40);
		
		

		System.out.println("Before removing element = "+q1.getFirst());
		
		System.out.println("Element removed = "+q1.removeFirst());
		
		System.out.println("After removing element = "+q1.element());
	}

}
