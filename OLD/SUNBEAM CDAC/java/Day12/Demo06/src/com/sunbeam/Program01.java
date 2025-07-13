package com.sunbeam;

class Date{
	int day;
	int month;
	int year;
	
	public Date() {
	}
	
	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	@Override
	public String toString() {
		return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
	}
}

class Person implements Cloneable{
	String name;
	Date dob;
	

	public Person() {
	}
	
	public Person(String name, int day, int month, int year) {
		this.name = name;
		this.dob = new Date(day,month,year);	
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", dob=" + dob + "]";
	}	
	
	@Override
	public Person clone() throws CloneNotSupportedException {
		Person p = new Person();
		p.name = this.name;
		p.dob = new Date();
		p.dob.day = this.dob.day;
		p.dob.month = this.dob.month;
		p.dob.year = this.dob.year;
		return p;
	}
}

public class Program01 {

	public static void main(String[] args) throws CloneNotSupportedException {
		Person p1 = new Person("Anil",10,1,2000);
		System.out.println(p1);
		Person p2 = p1.clone();
		System.out.println(p2);
		
		p2.name = "Mukesh";
		p2.dob.month = 2;
		p2.dob.day = 15;
		
		System.out.println("After change in p2 - ");
		
		System.out.println("p1 - "+p1);
		System.out.println("p2 - "+p2);
		
	}

}
