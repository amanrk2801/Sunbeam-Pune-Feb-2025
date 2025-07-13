package com.sunbeam;

import java.util.Scanner;

public class BinarySearchMain {
	
	public static int binarySearch(int arr[], int N, int key) {
		int left = 0, right = N-1, mid;
		//1. decide key top be searched ---> key
		while(left <= right) {
			//2. divide array into two parts (find mid)
			mid = (left + right) / 2;
			//3. compare key with middle element of the array
			if(key == arr[mid])
				//4. if key is matching with middle element, stop and return index of middle element
				return mid;
			//5. if key is less than middle element, then search key into left side
			else if(key < arr[mid])
				right = mid - 1;
			//6. if key is greater than middle element, then search key into right side
			else // if(key > arr[mid])
				left = mid + 1;
		}//7. repeat step 2 to 6 till key is not found or array is valid
		//8. if key is not found, then return -1
		return -1;
	}
	
	public static int binarySearch(int arr[], int key, int left, int right) {
		//0. stop if invalid partition
		if(left > right)
			return -1;
		//1. decide key top be searched -- key
		//2. divide array into two parts
		int mid = (left + right) / 2;
		//3. compare key with middle element of the array
		if(key == arr[mid])
			//4. if key is matching with middle element, stop and return index of middle element
			return mid;
		//5. if key is less than middle element, then search key into left side
		else if(key < arr[mid])
			return binarySearch(arr, key, left, mid-1);
		//6. if key is greater than middle element, then search key into right side
		else
			return binarySearch(arr, key, mid+1, right);
	}

	public static void main(String[] args) {
		int arr[] = {11, 22, 33, 44, 55, 66, 77, 88, 99};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter key to be searched : ");
		int key = sc.nextInt();
		
		//int index = binarySearch(arr, arr.length, key);
		int index = binarySearch(arr, key, 0, arr.length-1);
		if(index != -1)
			System.out.println("Key is found at index : " + index);
		else
			System.out.println("Key is not found");
		
		sc.close();

	}

}
