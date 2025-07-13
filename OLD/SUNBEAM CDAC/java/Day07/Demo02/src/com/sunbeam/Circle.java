package com.sunbeam;

import java.util.Scanner;

public class Circle implements Shape {
	
	private int radius; 
	
	@Override
	public void accept(Scanner sc) {
		System.out.println("Enter radius - ");
		radius = sc.nextInt();
	}

	@Override
	public void calculateArea() {
		System.out.println("Area of Circle - "+(PI * radius * radius));
	}

}
