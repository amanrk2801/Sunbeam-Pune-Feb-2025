package com.sunbeam;

import java.util.Scanner;

public class Program01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee e1 = new Employee();
		e1.acceptEmployee(sc);
		e1.displayEmployee();
		sc.close();
	}
	
	public static void main1(String[] args) {
		Scanner sc = new Scanner(System.in);
		Person p1 = new Person();
		p1.acceptPerson(sc);
		p1.displayPerson();
		sc.close();
	}

}
