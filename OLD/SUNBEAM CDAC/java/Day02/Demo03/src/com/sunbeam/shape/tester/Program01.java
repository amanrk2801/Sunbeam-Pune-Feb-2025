package com.sunbeam.shape.tester;

//import com.sunbeam.shape.dim2d.Circle;
//import com.sunbeam.shape.dim2d.Rectangle;

// to import all the classes from the dim2d package
import com.sunbeam.shape.dim2d.*;



public class Program01 {

	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		r.accept();
		r.display();
		
		Circle c = new Circle();
		c.accept();
		c.display();
	}

}
