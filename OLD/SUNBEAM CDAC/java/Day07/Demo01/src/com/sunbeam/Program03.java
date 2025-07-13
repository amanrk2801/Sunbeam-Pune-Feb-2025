package com.sunbeam;

import java.util.Scanner;

class Point implements Displayable {

	@Override
	public void display() {
		System.out.println("Point:::display()");
	}

}

public class Program03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Displayable d1;
		//d1 = new Date(); // upcasting
		d1 = new Point(); // upcasting

		if (d1 instanceof Date) {
			Date d = (Date) d1; // downcasting
			d.accept(sc);
		}
		d1.display();
		sc.close();
	}

	public static void main1(String[] args) {
		Scanner sc = new Scanner(System.in);
		Acceptable a1;
		a1 = new Date(); // upcasting
		a1.accept(sc);
		a1.display();
		sc.close();
	}

}
