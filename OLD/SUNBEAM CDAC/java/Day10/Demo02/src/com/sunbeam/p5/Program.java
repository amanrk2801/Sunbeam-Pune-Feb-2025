package com.sunbeam.p5;

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
	
	public static void main(String[] args) {
		//Box b = new Box(); // RAW type
		
		// Box<Integer> b1 = new Box(); // box object is of raw type
		
		// Box<Integer> b1 = new Box<Integer>();// OK
		
		Box<Integer> b1 = new Box<>();
		b1.setObj(10);
		Integer i1 = b1.getObj();
		System.out.println(i1);
		
		//Box<Number> b2 = new Box<Integer>(); // NOT OK
		
		
	}


}
