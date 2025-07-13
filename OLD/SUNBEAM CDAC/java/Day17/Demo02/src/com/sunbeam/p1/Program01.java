package com.sunbeam.p1;

class Outer{
	int field1 = 10;
	static int field2 = 20;
	
	 class Inner{
		int field3 = 30;
		static int field4 = 40;  // NOT ALLOWED
		
		
		void method1() {
			System.out.println(field1);
			System.out.println(field2);
		
			System.out.println(field3);
		}
		
		// Not Allowed
		// static void method2() {	
		//}
		
	}
	
}

public class Program01 {

	public static void main(String[] args) {
		Outer o1 = new Outer();
		Outer.Inner i1 = o1.new Inner();
	}

}
