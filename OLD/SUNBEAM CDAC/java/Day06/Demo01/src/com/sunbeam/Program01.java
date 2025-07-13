package com.sunbeam;

import java.util.Scanner;

public class Program01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Person p = new Employee(); // upcasting
//		Person p = new Person();
		p.accept(sc);
		p.display();
		
		Person.method1();

		if (p instanceof Employee) {
			Employee e = (Employee) p; // Downcasting
			e.calculateTax();
		}
		sc.close();
	}

}
