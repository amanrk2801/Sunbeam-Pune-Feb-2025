package com.sunbeam;

import java.util.Scanner;

public class Program01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee employee = new Salesman();
		employee.accept(sc);
		System.out.println(employee);
		employee.calculateTotalSalary();
		sc.close();
		
	}

}
