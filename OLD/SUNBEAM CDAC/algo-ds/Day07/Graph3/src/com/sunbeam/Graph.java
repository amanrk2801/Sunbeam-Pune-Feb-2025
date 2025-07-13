package com.sunbeam;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Graph {
	private final int INF = 999;
	private int vertexCount, edgeCount;
	private List<Integer> adjlist[];
	public Graph(int vCount) {
		vertexCount = vCount;
		adjlist = new List[vertexCount];
		for(int i = 0 ; i < vertexCount ; i++)
			adjlist[i] = new LinkedList<Integer>();
		
	}
	
	public void accept(Scanner sc) {
		System.out.println("Enter edge count : ");
		edgeCount = sc.nextInt();
		System.out.println("Enter edges (src, dest) : ");
		for(int i = 0 ; i < edgeCount ; i++) {
			int src = sc.nextInt();
			int dest = sc.nextInt();
			adjlist[src].add(dest);
			adjlist[dest].add(src);	// comment for directed graph
		}
	}
	
	public void print() {
		System.out.println("Graph : ");
		for(int i = 0 ; i < vertexCount ; i++) {
			System.out.print(i + " -> ");
			for(Integer j : adjlist[i]) {
				System.out.print(j + " ");
			}
			System.out.println("");
		}
	}
	
}























