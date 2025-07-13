package com.sunbeam;

public class Program {
	public static void main(String[] args) {
		Time t1; //Reference
		t1 = new Time(); // object
		
		Time t2 = new Time();
		
		t1.accept(); // accept(t1)
		t2.accept();
		
		t1.display();
		t2.display();
	}
}
