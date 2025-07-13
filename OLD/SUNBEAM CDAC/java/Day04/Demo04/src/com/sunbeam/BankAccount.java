package com.sunbeam;

import java.util.Scanner;

public class BankAccount {
	private final int accno;
	private String name;
	private double balance;
	private static int generate_accno=1000;
	
	{
		accno = ++generate_accno;
	}
	
	public BankAccount() {
		name = "";
	}

	public BankAccount( String name, double balance) {
		this.name = name;
		this.balance = balance;
	}
	
	public void acceptAccount() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name - ");
		name = sc.nextLine();
		System.out.println("Enter initial balance - ");
		balance = sc.nextDouble();
	}
	
	public void displayAccountDeatils() {
		System.out.println("Accno - "+accno);
		System.out.println("Name - "+name);
		System.out.println("Balance - "+balance);
	}
	
	
}
