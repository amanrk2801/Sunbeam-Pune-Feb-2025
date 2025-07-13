package com.sunbeam;

import java.util.Scanner;

public class Person {
	private String name;
	private String mobile;
	
	public Person() {
		System.out.println("Person()");
	}
	
	public void acceptPerson(Scanner sc) {
		System.out.println("Enter name -");
		name = sc.next();
		System.out.println("Enter mobile -");
		mobile = sc.next();
		
	}
	
	public void displayPerson() {
		System.out.println("Name - "+name);
		System.out.println("Mobile - "+mobile);
	}
}
