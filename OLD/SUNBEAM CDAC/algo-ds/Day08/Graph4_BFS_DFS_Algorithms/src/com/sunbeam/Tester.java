package com.sunbeam;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter vertex count : ");
		int vCount = sc.nextInt();		
		
		Graph g = new Graph(vCount);
		
		g.accept(sc);
		/*
		g.print();
		
		g.DFSTrvaversal(1);
		g.BFSTraversal(1);
		
		if(g.isConnected(1))
			System.out.println("Graph is connected");
		else
			System.out.println("Graph is not connected");
		
		g.singleSourcePathLength(0);
		*/
		
		g.DFSSpanningTree(1);
		g.BFSSpanningTree(1);
		
		sc.close();

	}

}

/*

6
7
0 1
0 2
0 3
1 2
1 4
3 4
3 5


 */












