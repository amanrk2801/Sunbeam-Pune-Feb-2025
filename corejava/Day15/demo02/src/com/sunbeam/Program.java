package com.sunbeam;


class Outer{
	static int outerField1 = 10; 
	int outerField2 = 20;
	int field = 30;  
	
	class Inner{
		final static int innerField1 = 40; 
		int innerField2 = 50;
		int field = 60;  
		
		void display( ) {
			System.out.println("outerField1 : " + outerField1);//10 
			System.out.println("outerField1 : " + outerField2); // 20  
			System.out.println("Field : "+Outer.this.field);//30
			System.out.println("innerField1 : "+innerField1);//40
			System.out.println("innerField2 : "+innerField2);//50 
			System.out.println("Field : "+field);//60
		}
		
	}
}

public class Program {
	public static void main(String[] args) {
		Outer outer = new Outer(); // Outer-class Object 
		Outer.Inner inObj = outer.new Inner(); 
		inObj.display();
	}

}












