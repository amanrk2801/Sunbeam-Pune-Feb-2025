package com.sunbeam;

public class Date {
	private int day;
	private int month;
	private int year;
	
	public Date() {
		this(1,1,1900); // Constructor Chaining
	}

	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
		System.out.println("Parameterized Ctor");
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setMonth(int month) {
		this.month = month;
	}
	public int getMonth() {
		return month;
	}
	
	public void setDay(int day) {
		this.day = day;
	}
	
	public int getDay() {
		return day;
	}
	
	
	
	
}
