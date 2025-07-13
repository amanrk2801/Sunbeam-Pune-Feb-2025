package com.sunbeam;

class Singleton2{
	//step-3
	private static Singleton2 ref = null;
	
	static {
		ref = new Singleton2();
	}
	
	// step-1
	private Singleton2() {
		System.out.println("Inside Ctor");
	}
	
	//step-2
	public static Singleton2 getInstance(){
		return ref;
	}
}

public class Program03 {

	public static void main(String[] args) {
		Singleton2 s1 = Singleton2.getInstance();
		Singleton2 s2 = Singleton2.getInstance();
		Singleton2 s3 = Singleton2.getInstance();
		Singleton2 s4 = Singleton2.getInstance();
	}

}
