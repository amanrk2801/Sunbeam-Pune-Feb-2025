package com.sunbeam;

import java.util.Scanner;

public class Graph {
	private final int INF = 999;
	private int vertexCount, edgeCount;
	private int adjmat[][];
	public Graph(int vCount) {
		vertexCount = vCount;
		adjmat = new int[vertexCount][vertexCount];
		for(int i = 0 ; i < vertexCount ; i++) {
			for(int j = 0 ; j < vertexCount ; j++)
				adjmat[i][j] = INF;
		}
	}
	
	public void accept(Scanner sc) {
		System.out.println("Enter edge count : ");
		edgeCount = sc.nextInt();
		System.out.println("Enter edges (src, dest, wt) : ");
		for(int i = 0 ; i < edgeCount ; i++) {
			int src = sc.nextInt();
			int dest = sc.nextInt();
			int wt = sc.nextInt();
			adjmat[src][dest] = wt;
			adjmat[dest][src] = wt;	// comment for directed graph
		}
	}
	
	public void print() {
		System.out.println("Graph : ");
		for(int i = 0 ; i < vertexCount ; i++) {
			for(int j = 0 ; j < vertexCount ; j++) {
				System.out.print(adjmat[i][j] + "\t");
			}
			System.out.println("");
		}
	}
	
}























