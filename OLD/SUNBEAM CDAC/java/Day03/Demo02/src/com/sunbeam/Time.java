package com.sunbeam;

public class Time {
	private int hrs;
	private int mins;

	// Object initializer-1
	{
		System.out.println("Object initializer-1");
		hrs = 10;
		mins = 20;
	}

	// Object initializer-2
	{
		System.out.println("Object initializer-2");
		hrs = 11;
		mins = 30;
	}

	public void display() {
		System.out.println("Time - " + hrs + ":" + mins);
	}
}
