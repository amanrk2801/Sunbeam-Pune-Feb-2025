package com.sunbeam;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class Program03 {
	public static void main(String[] args) {
		Vector<Integer> v1 = new Vector<Integer>();
		v1.addElement(10);
		v1.addElement(20);
		v1.addElement(30);
		v1.addElement(40);
		v1.addElement(50);
		v1.addElement(10);
		v1.addElement(20);
		v1.addElement(30);
		v1.addElement(40);
		v1.addElement(50);
		v1.addElement(60);
		
		
		
		System.out.println("capacity - "+v1.capacity());
		System.out.println("Size - "+v1.size());
		
		// It only works for vector
		Enumeration<Integer> en = v1.elements();
		while(en.hasMoreElements())
			System.out.println(en.nextElement());
	}

}
