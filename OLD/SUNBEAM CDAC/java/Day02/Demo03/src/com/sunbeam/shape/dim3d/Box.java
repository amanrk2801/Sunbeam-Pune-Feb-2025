package com.sunbeam.shape.dim3d;

import java.util.Scanner;

public class Box {
	int length;
	int breadth;
	int height;
	
	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length, Breadth and Height - ");
		length = sc.nextInt();
		breadth = sc.nextInt();
		height = sc.nextInt();
	}
	
	public void display() {
		System.out.println("Area of Box - "+(length*breadth*height));
	}
}
