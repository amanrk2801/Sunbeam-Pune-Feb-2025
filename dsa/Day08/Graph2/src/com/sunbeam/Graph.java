package com.sunbeam;

import java.util.Scanner;

public class Graph {
	private final int INF = 999;
	private int vertexCount, edgeCount;
	private int adjMat[][];
	public Graph(int vCount) {
		vertexCount = vCount;
		adjMat = new int[vertexCount][vertexCount];
		for(int u = 0 ; u < vertexCount ; u++)
			for(int v = 0 ; v < vertexCount ; v++)
				adjMat[u][v] = INF;
	}
	
	public void accept(Scanner sc) {
		System.out.print("Enter edge Count : ");
		edgeCount = sc.nextInt();
		System.out.println("Enter edges : (src, dest, wt) : ");
		for(int i = 0 ; i < edgeCount ; i++) {
			int src = sc.nextInt();
			int dest = sc.nextInt();
			int wt = sc.nextInt();
			adjMat[src][dest] = wt;
			adjMat[dest][src] = wt;		// comment for directed graph
		}
	}
	
	public void print() {
		System.out.println("Gaph : ");
		for(int u = 0 ; u < vertexCount ; u++) {
			for(int v = 0 ; v < vertexCount ; v++) {
				System.out.print(" " + adjMat[u][v]);
			}
			System.out.println("");
		}
	}
}














