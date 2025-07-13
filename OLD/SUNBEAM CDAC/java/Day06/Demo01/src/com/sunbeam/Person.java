package com.sunbeam;

import java.util.Scanner;

public class Person {
	private String name;
	
	public Person() {
	}

	public void accept(Scanner sc) {
		System.out.println("Enter name - ");
		name = sc.next();
	}
	
	public void display() {
		System.out.println("Name - "+name);
	}
	
	public static void method1() {
		System.out.println("Person::method1");
	}
}
