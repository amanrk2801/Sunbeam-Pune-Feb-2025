package com.sunbeam.p4;

class Box<T>
{
	private T obj;
	
	public void setObj(T obj) {
		this.obj = obj;
	}
	
	public T getObj() {
		return obj;
	}
}

public class Program {
	// Lowerbound
	public static void display(Box<? super Integer> b) {
		System.out.println(b.getObj());
	}
	
	public static void main(String[] args) {
		Box<Integer> b1 = new Box<Integer>();
		b1.setObj(10);
		display(b1);
		
		Box<Double> b2 = new Box<Double>();
		b2.setObj(10.12);
		display(b2); // compiler error
		
		Box<String> b3 = new Box<String>();
		b3.setObj("sunbeam");
		display(b3); // compiler error
		
		Box<Number> b4 = new Box<Number>();
		b4.setObj(10);
		display(b4);		
	}


}
