package com.sunbeam;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Vector;

public class Program01 {

	public static void main(String[] args) {
		//Collection<Integer> c1 = new ArrayList<Integer>();
		//Collection<Integer> c1 = new LinkedList<Integer>();
		Collection<Integer> c1 = new Vector<Integer>();
		
		c1.add(10);
		c1.add(20);
		c1.add(30);
		c1.add(40);
		c1.add(50);
		
		// can be used to iterate over all the collection.
		for (Integer element : c1)
			System.out.print(element+", ");
		System.out.println();

		System.out.println(c1.contains(30));
		System.out.println(c1.contains(60));
		
		//c1.clear();
		System.out.println(c1.isEmpty());
		
		c1.remove(30);
		for (Integer element : c1)
			System.out.print(element+", ");
		System.out.println();
		
		System.out.println(c1.size());
		
	}

}
