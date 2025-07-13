package com.sunbeam;


public class Program03 {
	public static void main(String[] args) {
		Time t1 = new Time();
		try {
			t1.setHr(50);
			t1.setMin(70);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(t1);
	}
}
