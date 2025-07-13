package com.sunbeam;

import java.util.function.BinaryOperator;

public class Program05 {
	
public static void main(String[] args) {
	int z = 30;
	//z = 40;
	
//	BinaryOperator<Integer> b1 = new BinaryOperator<Integer>() {
//			@Override
//			public Integer apply(Integer n1, Integer n2) {
//				return n1+n2+z;
//			}
//		};

	BinaryOperator<Integer> b1 = (x,y)->x+y+z; // Capturing lambda
	System.out.println("Result - "+b1.apply(10, 20));
	
	BinaryOperator<Integer> b2 = (x,y)->x+y; // non capturing lambda
	System.out.println("Result - "+b2.apply(10, 20));
	
}

}
