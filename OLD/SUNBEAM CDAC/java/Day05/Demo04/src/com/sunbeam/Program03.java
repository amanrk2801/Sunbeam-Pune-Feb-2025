package com.sunbeam;

import java.util.Scanner;

public class Program03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Person p = new Employee(); // upcasting
		p.accept(sc); // Late Binding
		p.display();
		sc.close();
	}
	

}
