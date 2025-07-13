package com.sunbeam;

import java.io.IOException;

import com.sunbeam.exceptions.InvalidTimeException;

public class Time {
	private int hr;
	private int min;
	
	public void setHr(int hr)throws InvalidTimeException {
		if(hr<0 || hr>23)
			throw new InvalidTimeException();
		this.hr = hr;
	}
	
	public void setMin(int min) throws InvalidTimeException {
		if(min<0 || min>59)
			throw new InvalidTimeException("min should be 0 to 59");
		this.min = min;
	}
}
