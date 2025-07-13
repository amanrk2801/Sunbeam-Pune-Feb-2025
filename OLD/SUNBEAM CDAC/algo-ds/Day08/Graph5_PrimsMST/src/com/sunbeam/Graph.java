package com.sunbeam;

import java.util.Scanner;

public class Graph {
	
	
	static class Table{
		// create arrays to keep track of keys,parents and mst
		private int keys[];
		private int parents[];
		private boolean mst[];
		public Table(int vCount) {
			keys = new int[vCount];
			parents = new int[vCount];
			mst = new boolean[vCount];
			for(int i = 0 ; i < vCount ; i++) {
				keys[i] = 999;
				parents[i] = -1;
				mst[i] = false;
			}
		}
		
		public int findMinKeyVertex() {
			int minKey = 999, minKeyVertex = -1;
			for(int i = 0 ; i < keys.length ; i++) {
				if(!mst[i] && keys[i] < minKey) {
					minKey = keys[i];
					minKeyVertex = i;
				}
			}
			return minKeyVertex;
		}
		
		public int printMST() {
			int wt = 0;
			System.out.print("MST :: ");
			for(int i = 0 ; i < parents.length ; i++) {
				System.out.print("(" + parents[i] + "-" + i + ")");
				wt += keys[i];
			}
			System.out.println("");
			return wt;
		}
	}
	
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
	
	public void primsMST(int start) {
		//1. create table to keep track of keys,parents and mst
		Table tbl = new Table(vertexCount);
		//2. make key of start vertex 0
		tbl.keys[start] = 0;
		
		//3. repeat till all vertices are not added into MST
		int count = 1;
		while(count <= vertexCount) {
			//4. choose minimum key vertex
			int u = tbl.findMinKeyVertex();
			//5. increment count
			count++;
			//6. add minimum key vertex into MST
			tbl.mst[u] = true;
			//7. update keys of all adjacent vertices
			for(int v = 0 ; v < vertexCount ; v++) {
				//		adjacent			added or not
				if(adjmat[u][v] != INF && !tbl.mst[v] && adjmat[u][v] < tbl.keys[v]) {
					tbl.keys[v] = adjmat[u][v];		// updated key
					tbl.parents[v] = u;				// updated parent
				}
			}
		}
		//8. print MST and find weight of MST
		int wt = tbl.printMST();
		System.out.println("Weight of MST :: " + wt);
	}
	
}























