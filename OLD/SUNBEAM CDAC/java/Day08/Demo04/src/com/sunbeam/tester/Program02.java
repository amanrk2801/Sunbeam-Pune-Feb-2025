package com.sunbeam.tester;

import com.sunbeam.Time;
import com.sunbeam.exceptions.InvalidTimeException;

public class Program02 {

	public static void main(String[] args) {
		Time t1 = new Time();
		try {
			t1.setHr(10);
			t1.setMin(70);
		} catch (InvalidTimeException e) {
			e.printStackTrace();
		}
	}

}
