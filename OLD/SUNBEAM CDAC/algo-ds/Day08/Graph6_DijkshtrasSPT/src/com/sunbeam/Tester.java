package com.sunbeam;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter vertex count : ");
		int vCount = sc.nextInt();		
		
		Graph g = new Graph(vCount);
		
		g.accept(sc);
		//g.print();
		g.dijkshtraSPT(2);
		
		sc.close();

	}

}

/*

7
12
0 1 2
1 4 10
4 6 6
6 5 1
2 5 5
2 0 4
0 3 1
1 3 3
3 4 7
3 6 4
3 5 8
3 2 2



 */












