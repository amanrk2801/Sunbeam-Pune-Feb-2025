package com.sunbeam.p2;
// From java 5
class Box<T>{
	private T data;
	
	public void setData(T data) {
		this.data = data;
	}
	
	public T getData() {
		return data;
	}
}

public class Program {
	public static void main(String[] args) {
		Box<Integer> b1 = new Box<Integer>();
		b1.setData(new Integer(10));
		Integer i1 = b1.getData();
		System.out.println("i1 - "+i1);
		
		Box<String> b2 = new Box<String>();
		b2.setData("sunbeam");
		String s1 = b2.getData();
		System.out.println("s1 - "+s1);
		
		Box<Double> b3 = new Box<Double>();
		//b3.setData("12.24"); // compiler error
		b3.setData(new Double(12.24));
		Double d1 = b3.getData();
		System.out.println("d1 -  "+d1);
		
	}

}
