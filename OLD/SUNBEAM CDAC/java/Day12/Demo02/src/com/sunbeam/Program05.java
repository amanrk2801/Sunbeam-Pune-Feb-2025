package com.sunbeam;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Program05 {

	public static void main(String[] args) {
		Queue<Integer> q1 = new LinkedList<Integer>();
		
		q1.add(40);
		q1.add(10);
		q1.add(30);
		q1.add(20);
		
		while(!q1.isEmpty())
			System.out.println(q1.remove());
	}

}
