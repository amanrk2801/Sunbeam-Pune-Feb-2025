package com.sunbeam;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Program01 {

	public static void main(String[] args) {
		//Map<Integer, String> m1 = new HashMap<Integer, String>();
		//Map<Integer, String> m1 = new LinkedHashMap<Integer, String>();
		//Map<Integer, String> m1 = new TreeMap<Integer, String>();
		Map<Integer, String> m1 = new Hashtable<Integer, String>();
		
		m1.put(121, "Prasad");
		m1.put(250, "Anil");
		m1.put(232, "Mukesh");
		m1.put(180, "Sham");
		m1.put(345, "Nikhil");
		m1.put(346, "Nikhil");
		
	   Set<Integer> keys= m1.keySet();
	   System.out.println("Keys -->");
	   for (Integer element : keys)
		   System.out.println(element);
	   
	   Collection<String> values= m1.values();
	   System.out.println("Values -->");
	   for (String element : values)
		   System.out.println(element);
	   
	    Set<Map.Entry<Integer,String>> set = m1.entrySet();
	    System.out.println("key-Value -->");
	    for(Map.Entry<Integer,String> element: set)
	    	System.out.println(element);
	   
	}

}
