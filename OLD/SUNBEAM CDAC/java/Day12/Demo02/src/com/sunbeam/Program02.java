package com.sunbeam;

import java.util.ArrayDeque;
import java.util.Queue;

public class Program02 {

	public static void main(String[] args) {
		Queue<Integer> q1 = new ArrayDeque<Integer>();
		q1.offer(10);
		q1.offer(20);
		q1.offer(30);
		q1.offer(40);
		
		
		System.out.println("Before removing element = "+q1.peek());
		
		System.out.println("Element removed = "+q1.poll());
		
		System.out.println("After removing element = "+q1.peek());
	}

}
