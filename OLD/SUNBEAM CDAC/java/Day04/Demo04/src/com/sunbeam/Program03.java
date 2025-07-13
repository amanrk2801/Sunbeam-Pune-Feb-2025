package com.sunbeam;


public class Program03 {
	public static void main(String[] args) {
		BankAccount [] accounts = new BankAccount[10];
		
//		BankAccount b1 = new BankAccount();
//		b1.acceptAccount();
		
		accounts[0] = new BankAccount();
		accounts[0].acceptAccount();
		
//		BankAccount b2 = new BankAccount("Anil",10000);
		accounts[1] = new BankAccount("Anil",10000);
		
//		b1.displayAccountDeatils();
//		b2.displayAccountDeatils();
		
		accounts[0].displayAccountDeatils();
		accounts[1].displayAccountDeatils();
	}

}
