package com.sunbeam;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Program02 {
	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<Integer>();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		l1.add(50);
		l1.add(20);
		
		l1.add(2,300);
		
		// will work for all the collection
		System.out.println("using for-each-->");
		for (Integer element : l1)
			System.out.println(element);
		
		System.out.println(l1.indexOf(40));
		System.out.println(l1.indexOf(20));
		System.out.println(l1.lastIndexOf(20));
		
		l1.remove(3);
		l1.remove(new Integer(20));
		
		System.out.println("After removing elements-->");
		for (Integer element : l1)
			System.out.println(element);
		
	}

}
