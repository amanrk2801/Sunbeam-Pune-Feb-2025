package com.sunbeam;

import java.util.Scanner;

interface Acceptable{
	void accept(Scanner sc);
}
interface Dispalyable{
	void display();
}

class Employee implements Acceptable,Dispalyable{
	int id;
	double salary;
	
	@Override
	public void accept(Scanner sc) {
		
	}

	@Override
	public void display() {
		
	}
	
}

class Date implements Acceptable{
	int day;
	int month;
	int year;
	
	@Override
	public void accept(Scanner sc) {
		
	}
}

class Point implements Acceptable,Dispalyable{
	int x;
	int y;

	@Override
	public void accept(Scanner sc) {
		
	}

	@Override
	public void display() {
		
	}
}

public class Program01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
}
