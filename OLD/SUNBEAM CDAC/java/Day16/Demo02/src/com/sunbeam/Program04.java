package com.sunbeam;

import java.util.function.BinaryOperator;

public class Program04 {

	public static void displayResult(BinaryOperator<Integer> b1)
	{
		System.out.println("Result - "+b1.apply(10,5));		
	}
	
	// OR
	
	public static void displayResult2(BinaryOperator<? super Integer> b1) {
		System.out.println("Result - "+b1.apply(10,5));
	}
	
	public static void main(String[] args) {
//		BinaryOperator<Integer> b1 = new BinaryOperator<Integer>() {
//			@Override
//			public Integer apply(Integer n1, Integer n2) {
//				return n1+n2;
//			}
//		};
		
		displayResult((x,y)->x+y);
		
		displayResult((x,y)->x*y);
		
		displayResult2((x,y)->x/y);
	}

}
