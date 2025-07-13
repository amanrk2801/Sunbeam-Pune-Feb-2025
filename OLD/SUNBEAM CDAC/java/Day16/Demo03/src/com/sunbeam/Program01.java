package com.sunbeam;

public class Program01 {

	public static void main(String[] args) {
		final int var1 = 30;
		int var2 = 40;
		
		//var2 = 400;
		
		//static class Local{ // NOT OK
		class Local{
			int field1=10;
			int field2=20;
			//static int field2=20; // NOT OK
			
			void method1() {
				System.out.println(field1);
				System.out.println(field2);
				System.out.println(var1);
				System.out.println(var2);
			}
			
			// cannot declare static method inside local class
			//static void method2() {
			//}
		}
		
		Local l1 = new Local();
		l1.method1();

	}

}
