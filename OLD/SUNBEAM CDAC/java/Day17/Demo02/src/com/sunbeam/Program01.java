package com.sunbeam;

class Outer{
	int field1 = 10;
	static int field2 = 20;
	
	static class Inner{
		int field3 = 30;
		static int field4 = 40; 
		
		
		void method1() {
			System.out.println(field1);
			System.out.println(field2);
		
			System.out.println(field3);
			System.out.println(field4);
		}
		
		static void method2() {
			System.out.println(field1);
			System.out.println(field2);
		
			System.out.println(field3);
			System.out.println(field4);
		}
	}
	
}

public class Program01 {

	public static void main(String[] args) {
		Outer.Inner i1 =  new Outer.Inner();
		i1.method1();

	}

}
