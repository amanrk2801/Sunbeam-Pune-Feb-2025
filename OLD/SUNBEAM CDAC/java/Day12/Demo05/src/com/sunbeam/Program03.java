package com.sunbeam;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

public class Program03 {

	public static void main(String[] args) {
		LocalDate d1 = LocalDate.now();
		System.out.println(d1);
		
		LocalDate d2 = LocalDate.of(2023, 1, 10);
		System.out.println(d2);
		
		LocalTime t1 = LocalTime.now();
		System.out.println(t1);
		
		LocalDateTime dt1 = LocalDateTime.now();
		System.out.println(dt1);
	}

}
