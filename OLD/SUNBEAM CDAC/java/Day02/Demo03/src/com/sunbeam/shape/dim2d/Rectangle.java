package com.sunbeam.shape.dim2d;
import java.util.Scanner;

public class Rectangle {
	int length;
	int breadth;
	
	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length and Breadth - ");
		length = sc.nextInt();
		breadth = sc.nextInt();
	}
	
	public void display() {
		System.out.println("Area of Rectangle - "+(length*breadth));
	}
}
