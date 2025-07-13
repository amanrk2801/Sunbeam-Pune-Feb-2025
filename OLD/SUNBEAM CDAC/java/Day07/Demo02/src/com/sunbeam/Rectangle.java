package com.sunbeam;

import java.util.Scanner;

public class Rectangle implements Shape{
	private int length;
	private int breadth;
	
	@Override
	public void accept(Scanner sc) {
		System.out.println("Enter length - ");
		length = sc.nextInt();
		System.out.println("Enter breadth - ");
		breadth = sc.nextInt();
	}
	
	@Override
	public void calculateArea() {
		System.out.println("Area of Rectnagle - "+(length * breadth));
	}
}
