package com.sunbeam;

//Multi dimensional Non-Primitive type of Array
public class Program04 {

	public static void main(String[] args) {
		Rectangle[][] arr; // reference
		arr = new Rectangle[2][2];
		arr[0][0] = new Rectangle();
		arr[0][1] = new Rectangle(10,20);
		arr[1][0] = new Rectangle();
		arr[1][1] = new Rectangle(20,8);
		
		// TODO - Display all the rectangle objects using for-loop and for-each
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++)
				System.out.print(arr[i][j] + " , ");
			System.out.println();
		}
	}
	
	
}
