package com.sunbeam;


public class Program02 {
	public static void main(String[] args) {
		Time t1 = new Time();
		t1.setHr(10);
		try {
			t1.setMin(70);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(t1);
	}

}
