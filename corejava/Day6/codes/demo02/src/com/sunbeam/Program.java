package com.sunbeam;

public class Program {

	public static void main(String[] args) throws CloneNotSupportedException {
		Date dt1 = new Date(1, 1, 2020); 
		Date dt2 = (Date) dt1.clone(); 
		
		System.out.println(dt1.toString());
		System.out.println(dt2.toString());
	}

}
