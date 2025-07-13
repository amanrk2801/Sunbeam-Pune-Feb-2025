package com.sunbeam;

import java.util.Scanner;

public class Time {

	// fields
	private int hrs;
	private int mins;

	// Default/Parametrless Constructor
	public Time() {
		System.out.println("Ctor called");
		hrs = 10;
		mins = 10;
	}

	// Parameterized Ctor
	public Time(int hrs, int mins) {
		System.out.println("Parameterized ctor");
		this.hrs = hrs;
		this.mins = mins;
	}
	
	// method
	public void accept()// accept(Time this)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the hrs - ");
		this.hrs = sc.nextInt();
		System.out.print("Enter the mins - ");
		mins = sc.nextInt();
	}

	// setter -> manipulate/write
	void setHrs(int hrs){
		this.hrs = hrs;
	}
	
	// Getter -> read
	int getHrs(){
		return hrs;
	}
	
	// Facilitator
	public void display() {
		System.out.println("Time - " + hrs + ":" + this.mins);
	}
}
