package com.sunbeam;

class Base{ // super
	public void m1() {
		System.out.println("Base::m1");
	}
	
	 void m2() {
		System.out.println("Incomplete Base::m2");
	}
}

class Derived extends Base{ // sub
	
	// method overriding
	@Override
	public void m2() {
		System.out.println("Complete Derived::m2");
	}
	
	public void m3() {
		System.out.println("Derived::m3");
	}
}

public class Program02 {

	public static void main(String[] args) {
		Derived d1 = new Derived();
		d1.m1();
		d1.m2(); 
		d1.m3();
	}
	
	public static void main1(String[] args) {
		Base b1 = new Base();
		b1.m1();
		b1.m2();
	}

}
