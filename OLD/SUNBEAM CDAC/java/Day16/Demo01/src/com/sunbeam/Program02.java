package com.sunbeam;

import java.sql.SQLException;

interface Printable {
	default void display()
	{
		System.out.println("Printable::display()");
	}
}

interface Displayable {
	default void display() {
		System.out.println("Displayable::display()");
	}
}

class Employee {

	public void display()  {
		System.out.println("Employee::display");
	}
}

//class Manager implements Printable,Displayable{	
//	@Override
//	public void display() {
//		Printable.super.display();
//		Displayable.super.display();
//	}
//}

// Superclass will get the highest priority
class Manager extends Employee implements Printable{

}

public class Program02 {
	
	public static void main(String[] args) {
		Employee e = new Manager();
		e.display();
		
		Printable p = new Manager();
		p.display();
		
		Manager m = new Manager();
		m.display();
	}

}
