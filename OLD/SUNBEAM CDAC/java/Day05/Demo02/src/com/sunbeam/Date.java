package com.sunbeam;

import java.util.Scanner;

public class Date {
	private int day;
	private int month;
	private int year;
	
	public Date() {
	}

	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public void acceptDate() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter day - ");
		day = sc.nextInt();
		System.out.println("Enter month - ");
		month = sc.nextInt();
		System.out.println("Enter year- ");
		year = sc.nextInt();
	}
	
	public String getDate() {
		return day+"/"+month+"/"+year;
	}
	
}
