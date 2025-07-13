package com.sunbeam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program03 {

	public static void main(String[] args) {
		List<String> l1 = new ArrayList<String>();
		Collections.addAll(l1, "Akash", "Nikhil", "Anil", "Mukesh", "Sham", "Anil","Nikhil");
		
		System.out.println("Distinct names -->");
		l1.stream().distinct().forEach(System.out::println);
		
		System.out.println("Names starting with A-->");
		l1.stream().filter(s->s.startsWith("A")).distinct().forEach(System.out::println);
		
		System.out.println("First 3 names in the collection -->");
		l1.stream().limit(3).forEach(System.out::println);
		
		System.out.println("Skip first 2 and display next 3 names in the collection -->");
		l1.stream().skip(2).limit(3).forEach(System.out::println);
	}

}
