package com.sunbeam;

import java.util.Scanner;

public class Program01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Date d = new Date();
		d.accept(sc);
		d.display();
		sc.close();
	}

}
