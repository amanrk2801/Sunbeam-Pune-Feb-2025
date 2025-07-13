package com.sunbeam;

//local class -- declared inside method
// local class in static method -- behaves like static member class
// object can be created without object of outer class.
// can access static members of outer class directly or with ClassName. 
class Outer{
	static int outerField1 = 10; 
	int outerField2 = 20;
	static int field = 30;  
	
	static class Inner{
		static int innerField1 = 40; 
		int innerField2 = 50;
		static int field = 60;  
		
		void display( ) {
			System.out.println("outerField1 : " + outerField1);//10 
			//System.out.println("outerField1 : " + outerField2); // NOT OK 
			System.out.println("Field : "+Outer.field);//30
			System.out.println("innerField1 : "+innerField1);//40
			System.out.println("innerField2 : "+innerField2);//50 
			System.out.println("Field : "+field);//60
		}
		
	}
}

public class Program {
	public static void main(String[] args) {
		Outer.Inner inObj = new Outer.Inner(); 
		inObj.display();
	}

}
