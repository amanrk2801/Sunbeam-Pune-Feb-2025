package com.sunbeam;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Program01 {

	public static void main(String[] args) {
		//Set<String> countries = new HashSet<String>();
		Set<String> countries = new LinkedHashSet<String>();
		//Set<String> countries = new TreeSet<String>();
		countries.add("India");
		countries.add("USA");
		countries.add("UK");
		countries.add("China");
		countries.add("Japan");
		countries.add("Bhutan");
		countries.add("India");
		countries.add("Japan");
		
		System.out.println("size - "+countries.size());

		for (String element : countries)
				System.out.println(element);
		
	}	

}
