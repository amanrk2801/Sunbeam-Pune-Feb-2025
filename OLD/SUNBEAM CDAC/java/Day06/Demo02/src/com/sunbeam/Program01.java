package com.sunbeam;

import java.util.Objects;

class Date {
	int day;
	int month;
	int year;

	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	@Override
	public String toString() {
		return day + "/" + month + "/" + year;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj==null)
			return false;
		if(this==obj)
			return true;
		if(obj instanceof Date) {
			Date d = (Date) obj; // Downcasting
			return this.day == d.day && this.month == d.month && this.year == d.year;
		}
		return false;
	}

}

class Employee {
	int id;
	String name;
}

public class Program01 {

	public static void main(String[] args) {
		Date d1 = new Date(1, 2, 2000);
		System.out.println("d1 = " + d1);

		Date d2 = new Date(1, 2, 2000);
		System.out.println("d1==d2 - " + (d1 == d2));

		Employee e1 = new Employee();

		if (d1.equals(e1))
			System.out.println("Objects are equal");
		else
			System.out.println("Objects are not equal");
	}

}
