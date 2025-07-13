package com.sunbeam;

public class Rectangle {
	int length = 10; // field initializer
	int breadth = 5; // field initializer
	
	public Rectangle() {
	}

	public Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	public void display() {
		System.out.println("Length - "+length);
		System.out.println("Breadth - "+breadth);
		System.out.println("Area - "+(length*breadth));
	}
}
