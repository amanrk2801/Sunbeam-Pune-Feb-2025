package com.sunbeam;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Program02 {

	public static void main(String[] args) {
		Collection<Integer> c1 = new ArrayList<Integer>();
		c1.add(10);
		c1.add(20);
		c1.add(30);
		c1.add(40);
		c1.add(50);
		
		// can be used to iterate over all the collection.
		System.out.println("using for each -->");
		for (Integer element : c1)
			System.out.print(element+", ");
		System.out.println();

		
		System.out.println("using Iterator-->");
		Iterator<Integer> itr = c1.iterator();
		while(itr.hasNext())
			System.out.print(itr.next()+", ");
		
		
	}

}
