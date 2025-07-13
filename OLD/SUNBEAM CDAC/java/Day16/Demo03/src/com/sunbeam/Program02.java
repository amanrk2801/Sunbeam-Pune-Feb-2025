package com.sunbeam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program02 {

	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<Integer>();
		Collections.addAll(l1, 7,3,2,5,4,6,9,1,8);
		
		System.out.println("Square of numbers sorted in asc order-->");
		l1.stream().sorted().map(e->e*e).forEach(e->System.out.println(e));
		
		System.out.println("Square of odd numbers -->");
		l1.stream().filter(e->e%2!=0).map(e->e*e).sorted().forEach(System.out::println);
	}

}
