package com.sunbeam;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Graph {
	private int vertexCount, edgeCount;
	private List<Integer> adjList[];
	public Graph(int vCount) {
		vertexCount = vCount;
		adjList = new List[vertexCount];
		for(int i = 0 ; i < vertexCount ; i++)
			adjList[i] = new LinkedList<Integer>();
	}
	
	public void accept(Scanner sc) {
		System.out.print("Enter edge Count : ");
		edgeCount = sc.nextInt();
		System.out.println("Enter edges : (src, dest) : ");
		for(int i = 0 ; i < edgeCount ; i++) {
			int src = sc.nextInt();
			int dest = sc.nextInt();
			adjList[src].add(dest);
			adjList[dest].add(src);		// comment for directed graph
		}
	}
	
	public void print() {
		System.out.println("Gaph : ");
		for(int u = 0 ; u < vertexCount ; u++) {
			System.out.print(u + " : ");
			for(Integer v : adjList[u]){
				System.out.print(" " + v);
			}
			System.out.println("");
		}
	}
}














