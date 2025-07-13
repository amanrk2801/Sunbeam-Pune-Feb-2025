package com.sunbeam.p2;

public class Program01 {
	int field3 = 30;
	static int field4 = 40;
	
	public void method1() { 
		 class LocalClass{
			int field1 = 10;
			//static int field2 = 20; // Not OK
			
			void m1() {
				System.out.println(field3);
				System.out.println(field4);
			}
			
			// NOT OK
			static void m2() {
			}
		}
	}
	
	public static void method2() {
		class LocalClass{
			int field1=10;
			//static int field2 = 20; // Not OK
			
			void m1() {
				System.out.println(field3);
				System.out.println(field4);
			}
			
			// NOT OK
			static void m2() {
			}
		}
	
	}
	
	public static void main(String[] args) {
	}

}
