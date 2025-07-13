package com.sunbeam;

import java.util.Stack;

public class Program04 {
	public static void main(String[] args) {
		Stack<Integer> s1 = new Stack<Integer>();
		s1.push(10);
		s1.push(20);
		s1.push(30);
		s1.push(40);
		
		System.out.println("peek - "+s1.peek());
		
		System.out.println("pop - "+s1.pop());
		System.out.println("pop - "+s1.pop());
		System.out.println("pop - "+s1.pop());

		System.out.println("peek - "+s1.peek());
	}
}
