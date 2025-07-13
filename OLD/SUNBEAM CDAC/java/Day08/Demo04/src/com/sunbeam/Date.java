package com.sunbeam;

import com.sunbeam.exceptions.InvalidDateException;

public class Date {
	private int day;
	private int month;
	private int year;
	
	public void setDay(int day) {
		// 1 to 31
		if(day<1 || day>31)
			throw new InvalidDateException();
		this.day = day;
	}
	
	public void setMonth(int month) {
		// 1 to 12
		if(month<1 || month>12)
			throw new InvalidDateException("month shoud be 1 to 12");
		this.month = month;
	}
	
	public void setYear(int year) {
		// 1900
		if(year<1900)
			//throw new RuntimeException(new InvalidDateException("year should be  > 1900"));
			// Exception chaining
			throw new InvalidDateException("year should be  > 1900");
		this.year = year;
	}
	
	

}
