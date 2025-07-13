package com.sunbeam;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Program01 {
	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<Integer>();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		l1.add(50);

		// will worl for all the collection
		System.out.println("using for-each-->");
		for (Integer element: l1)
			System.out.println(element);
		
		// it will work only for list
		System.out.println("using for-loop-->");
		for(int i=0; i<l1.size();i++)
			System.out.println(l1.get(i));
		
		System.out.println("List in reverse order -->");
		ListIterator<Integer> itr = l1.listIterator(l1.size());
		while(itr.hasPrevious()) {
			System.out.println(itr.previous());
		}
	}

}
