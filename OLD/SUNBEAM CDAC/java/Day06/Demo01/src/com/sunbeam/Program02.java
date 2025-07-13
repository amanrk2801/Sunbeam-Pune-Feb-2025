package com.sunbeam;

final class Arithmetic{
	
	public void add(int n1, int n2) {
		
	}
	
	public void sub(int n1, int n2) {
		
	}
}

final class TestSuper{
	
	public void method1() {
		
	}
	
	public final void method2() {
		
	}
}

class TestSub extends TestSuper{
	@Override
	public void method1() {
		super.method1();
	}
	
	@Override
	public void method2() {
		super.method2();
	}
}

public class Program02 {

	public static void main(String[] args) {

	}

}
