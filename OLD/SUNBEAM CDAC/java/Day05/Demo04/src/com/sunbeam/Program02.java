package com.sunbeam;

import java.util.Scanner;

public class Program02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee e1 = new Employee("e1","1234567",1,10000);
		e1.display();
		sc.close();
	}
	

}
