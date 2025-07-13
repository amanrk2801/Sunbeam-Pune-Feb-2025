package com.sunbeam.p1;

public class Program02 {

	public static void main(String[] args) {
		AccountType arr[] = AccountType.values();
		for (AccountType element : arr) {
			System.out.println(element+" - "+element.getRoi());
		}
	}

}
