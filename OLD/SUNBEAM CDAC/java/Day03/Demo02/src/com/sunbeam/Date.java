package com.sunbeam;

public class Date {
	
	private int day = 1; // Field Initializer
	private int month;
	private int year;
	
	// Object Initializer
	{
		System.out.println("Object Initializer");
		month = 2;
		day = 2;
	}

//	public Date(int day, int month, int year) {
//		this.day = day;
//		this.month = month;
//		this.year = year;
//	}
//	
	// Constructor
	public Date() {
		System.out.println("Parameterless Ctor");
		year =  1900;
	}
	

	public void displayDate() {
		System.out.println("Date - "+day+"/"+month+"/"+year);
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	public void setMonth(int month) {
		this.month = month;
	}

}
