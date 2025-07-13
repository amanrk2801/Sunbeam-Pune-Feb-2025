package com.sunbeam;

//Single dimensional Non Primitive type of Array
public class Program02 {

	public static void main(String[] args) {
		Rectangle[] arr; // Reference
		arr = new Rectangle[5]; // Array of References
		arr[0] = new Rectangle();
		arr[1] = new Rectangle(10, 20);
		arr[2] = new Rectangle();
		arr[3] = new Rectangle(20, 8);
		arr[4] = new Rectangle(25, 12);

		// TODO write for-loop to display all objects

		for (Rectangle element : arr) {
			element.display();
			System.out.println("------------------");
		}
	}

}
