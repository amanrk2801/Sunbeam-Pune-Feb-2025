package com.sunbeam;

import java.util.Scanner;

public interface Shape {
	void accept(Scanner sc);

	void calculateArea();

	default void calculatePerimeter() {
		System.out.println("Default Perimeter");
	}
	
	static Shape shapeFactory(int choice){
		switch (choice) {
		case 1:
			return new Rectangle();

		case 2:
			return new Circle();
			
		case 3:
			return new Square();
		}
		return null;
	}

}
