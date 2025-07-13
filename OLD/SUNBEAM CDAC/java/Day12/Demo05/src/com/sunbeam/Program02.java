package com.sunbeam;

import java.util.Calendar;
import java.util.Date;

public class Program02 {

	public static void main(String[] args) {
		Calendar c1 = Calendar.getInstance();
		System.out.println(c1);
		System.out.println("year - "+c1.get(Calendar.YEAR));
		System.out.println("month - "+(c1.get(Calendar.MONTH)+1));
		System.out.println("day of month - "+c1.get(Calendar.DAY_OF_MONTH));
		
	}

}
