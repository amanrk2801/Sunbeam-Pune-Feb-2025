package com.sunbeam;

import java.util.Scanner;

public class Person {
	private String name;
	private String mobile;
	
	public Person() {
		System.out.println("Person()");
	}
	
	public Person(String name, String mobile) {
		System.out.println("Person(String, String)");
		this.name = name;
		this.mobile = mobile;
	}

	public void accept(Scanner sc) {
		System.out.println("Enter name -");
		name = sc.next();
		System.out.println("Enter mobile -");
		mobile = sc.next();
		
	}
	
	public void display() {
		System.out.println("Name - "+name);
		System.out.println("Mobile - "+mobile);
	}
}
