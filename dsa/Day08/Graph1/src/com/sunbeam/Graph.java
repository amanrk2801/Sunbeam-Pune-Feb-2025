package com.sunbeam;

import java.util.Scanner;

public class Graph {
	private int vertexCount, edgeCount;
	private boolean adjMat[][];
	public Graph(int vCount) {
		vertexCount = vCount;
		adjMat = new boolean[vertexCount][vertexCount];
	}
	
	public void accept(Scanner sc) {
		System.out.print("Enter edge Count : ");
		edgeCount = sc.nextInt();
		System.out.println("Enter edges : (src, dest) : ");
		for(int i = 0 ; i < edgeCount ; i++) {
			int src = sc.nextInt();
			int dest = sc.nextInt();
			adjMat[src][dest] = true;
			adjMat[dest][src] = true;		// comment for directed graph
		}
	}
	
	public void print() {
		System.out.println("Gaph : ");
		for(int u = 0 ; u < vertexCount ; u++) {
			for(int v = 0 ; v < vertexCount ; v++) {
				System.out.print(adjMat[u][v] ? "1 " : "0 ");
			}
			System.out.println("");
		}
	}
}














