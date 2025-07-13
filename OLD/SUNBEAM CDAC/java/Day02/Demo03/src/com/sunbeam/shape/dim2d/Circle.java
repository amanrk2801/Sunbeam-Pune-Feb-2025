package com.sunbeam.shape.dim2d;

import java.util.Scanner;

public class Circle {
	int radius;
	
	public void accept() {
//		Scanner sc = new Scanner(System.in);
		System.out.print("Enter radius - ");
//		radius = sc.nextInt();
		radius = new Scanner(System.in).nextInt();
	}
	
	public void display() {
		System.out.println("Area of Circle - "+(3.14*radius*radius));		
	}
}
