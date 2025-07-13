package com.sunbeam;

import java.util.Scanner;

public class Date implements Acceptable,Displayable {
	int day;
	int month;
	int year;
	
	@Override
	public void accept(Scanner sc) {
		System.out.println("Enter day - ");
		day = sc.nextInt();
		System.out.println("Enter month - ");
		month = sc.nextInt();
		System.out.println("Enter year - ");
		year = sc.nextInt();
	}

	@Override
	public void display() {
		System.out.println(day+"/"+month+"/"+year);
	}
	
	
}
