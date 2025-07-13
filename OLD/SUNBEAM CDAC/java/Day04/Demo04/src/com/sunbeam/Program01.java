package com.sunbeam;

class Test{
	int num1=10;
//	static int num2=20; // Field Initializer
	static int num2;
	
	// static initializer block
	static{
		System.out.println("static-Initializer");
		num2 = 20;
	}
	
	// object initializer
//	{
//		System.out.println("Object-Initializer");
//		num2 = 20;
//	}
	
	public Test() {
		num2++;
	}
	
	void displayTest() {
		System.out.println("num1 - "+num1);
		System.out.println("num2 - "+num2);
	}
	
	static void displaymethod() {
		// Inside static methods we cannot access non static fields
		//System.out.println("num1 - "+num1); // NOT OK
		System.out.println("num2 - "+num2);
	}
	
	
}



public class Program01 {
	public static void main(String[] args) {
		Test t1 = new Test();
		t1.displayTest();
		
		Test t2 = new Test();
		t2.displayTest();

		// To access static members of the class use classname and . operator
		Test.displaymethod();
	}

}
