package com.sunbeam;

// Functional Interface
@FunctionalInterface
interface Test{
	void method(); // SAM
}

// Test2 is Not a functional interface
interface Test2{
	void method1();
	void method2();
}

@FunctionalInterface
interface Test3{
	void method1();
	default void method2() {
		
	}
}

@FunctionalInterface
interface Test4{
	void method1();
	
	default void method2() {
	}
	
	static void method3() {	
	}
}

public class Program03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
