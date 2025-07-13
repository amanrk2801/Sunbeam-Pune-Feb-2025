package com.sunbeam;

import java.util.function.BinaryOperator;

public class Program06 {

	public static void main(String[] args) {

		BinaryOperator<Integer> b2 = Integer::sum; // Method References
		System.out.println("Result - " + b2.apply(10, 20));
	}
}
