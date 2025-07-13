package com.sunbeam;

//Multi dimensional Primitive type of Array
public class Program05 {

	public static void main(String[] args) {
		int[][] arr; // reference
		arr = new int[2][]; // ragged array
		
		arr[0] = new int[2];
		arr[1] = new int[3];
		
		arr[0][0] = 10;
		arr[0][1] = 20;
		
		arr[1][0] = 30;
		arr[1][1] = 40;
		arr[1][2] = 50;

		System.out.println("using for-loop -->");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++)
				System.out.print(arr[i][j] + " , ");
			System.out.println();
		}
		
		System.out.println("using for-each -->");
		for(int[] ref: arr) {
			for(int element: ref)
				System.out.print(element+" , ");
			System.out.println();
		}
		
	}
	
	
}
