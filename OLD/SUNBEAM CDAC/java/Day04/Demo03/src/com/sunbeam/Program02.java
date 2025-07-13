package com.sunbeam;

class Circle{

//	final double PI=3.14; // Field Initializer
	final double PI;
	
	// Object-Initializer
//	{
//		PI = 3.14;
//	}
	
	public Circle() {
		this.PI = 3.14;
		
	}
	
	
	void displayPI(){
//		 PI = 4.15; // NOT OK
		System.out.println(PI);
	}
}

public class Program02 {

	public static void main(String[] args) {
		Circle c1 = new Circle();
		c1.displayPI();
		
	}

}
