package com.sunbeam;

public class Time {
	int hr;
	int min;

	public void setHr(int hr){
		if (hr < 0 || hr > 23)
//			throw new RuntimeException(); // unchecked Exception
			throw new RuntimeException("hrs should be 0 to 23"); // unchecked Exception
		this.hr = hr;
	}

	public void setMin(int min) throws Exception {
		if (min < 0 || min > 59)
//			throw new Exception(); // checked Exception
			throw new Exception("min should be 0 to 59"); // checked Exception
		this.min = min;
	}

	@Override
	public String toString() {
		return "Time - " + hr + " : " + min;
	}

}
