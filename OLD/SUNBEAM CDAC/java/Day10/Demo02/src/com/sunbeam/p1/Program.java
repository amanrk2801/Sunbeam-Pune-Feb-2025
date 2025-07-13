package com.sunbeam.p1;

interface Shape{
	
}

class Rectangle implements Shape{
	
}

class Circle implements Shape{
	
}


// bounded type parameter
//class Box<T extends Number>
class Box<T extends Shape>
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
		Box<Circle> b1 = new Box<Circle>();

		Box<Rectangle> b2 = new Box<Rectangle>();
		
		Box<String> b3 = new Box<String>();
		
	}

	
	public static void main1(String[] args) {
		//Box<Integer> b1 = new Box<Integer>();
		
		//Box<Double> b2 = new Box<Double>();
		
		//Box<Number> b3 = new Box<Number>();
		
		//Box<String> b4 = new Box<String>();
	}

}
