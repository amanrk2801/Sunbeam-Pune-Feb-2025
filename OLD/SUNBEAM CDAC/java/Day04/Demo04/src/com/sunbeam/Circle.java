package com.sunbeam;

public class Circle {
	int  radius;
	final static double PI = 3.14;
	
	public Circle(int radius) {
		this.radius = radius;
	}
	
	public void calculateArea() {
		System.out.println("Area of circle - "+(PI * radius*radius));
	}
	
}
