package com.sunbeam;

import java.util.Scanner;

public class Graph {
	
	private static final int INF = 999;
	static class Table{
		// create arrays to keep track of keys,parents and mst
		private int dist[];
		private boolean spt[];
		public Table(int vCount) {
			dist = new int[vCount];
			spt = new boolean[vCount];
			for(int i = 0 ; i < vCount ; i++) {
				dist[i] = INF;
				spt[i] = false;
			}
		}
		
		public int findMinDistVertex() {
			int minDist = INF, minDistVertex = -1;
			for(int i = 0 ; i < dist.length ; i++) {
				if(!spt[i] && dist[i] < minDist) {
					minDist = dist[i];
					minDistVertex = i;
				}
			}
			return minDistVertex;
		}
		
		public void printSPT(int start) {
			System.out.println("Shortest Paths :: ");
			for(int i = 0 ; i < dist.length ; i++)
				System.out.println(start + "->" + i + " = " + dist[i]);
		}
	}
	
	
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
			//adjmat[dest][src] = wt;	// comment for directed graph
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
	
	public void dijkshtraSPT(int start) {
		//1. create table to keep track of keys,parents and mst
		Table tbl = new Table(vertexCount);
		//2. make key of start vertex 0
		tbl.dist[start] = 0;
		
		//3. repeat till all vertices are not added into MST
		int count = 1;
		while(count <= vertexCount) {
			//4. choose minimum key vertex
			int u = tbl.findMinDistVertex();
			//5. increment count
			count++;
			//6. add minimum key vertex into MST
			tbl.spt[u] = true;
			//7. update keys of all adjacent vertices
			for(int v = 0 ; v < vertexCount ; v++) {
				//		adjacent			added or not
				if(adjmat[u][v] != INF && !tbl.spt[v] && (tbl.dist[u] + adjmat[u][v]) < tbl.dist[v]) {
					tbl.dist[v] = tbl.dist[u] + adjmat[u][v];		// updated key
				}
			}
		}
		//8. print SPT
		tbl.printSPT(start);
	}
	
}























