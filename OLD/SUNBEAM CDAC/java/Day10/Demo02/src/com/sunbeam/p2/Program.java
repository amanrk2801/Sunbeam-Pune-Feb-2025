package com.sunbeam.p2;

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
	// unbounded type
	public static void display(Box<?> b) {
		System.out.println(b.getObj());
	}
	
	public static void main(String[] args) {
		Box<Integer> b1 = new Box<Integer>();
		b1.setObj(10);
		display(b1);
		
		Box<Double> b2 = new Box<Double>();
		b2.setObj(10.12);
		display(b2);
		
		Box<String> b3 = new Box<String>();
		b3.setObj("sunbeam");
		display(b3);
	}


}
