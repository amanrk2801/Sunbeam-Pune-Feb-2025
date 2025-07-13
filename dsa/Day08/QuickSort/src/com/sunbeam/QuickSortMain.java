package com.sunbeam;

import java.util.Arrays;

public class QuickSortMain {
	
	public static void quickSort(int arr[], int left, int right) {
		//0. stop if single element or invalid partition
		if(left >= right)
			return;
		//1. choose pivot element
		//int pivot = arr[left];
		//2. do the arrangement of elements
		int i = left, j = right;
		while(i < j) {
			//2.1 find element greater than pivot
			for( ; i <= right && arr[i] <= arr[left] ; i++);
			//2.2 find element less or equal than pivot
			for( ; arr[j] > arr[left] ; j--);
			//2.3 swap ith and jth element if they are not crossed
			if(i < j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		//2.4 if j and j are crossed, swap jth element with pivot
		int temp = arr[left];
		arr[left] = arr[j];
		arr[j] = temp;
		//3. sort left and right partition of pivot individually
		quickSort(arr, left, j-1);
		quickSort(arr, j+1, right);
	}

	public static void main(String[] args) {
		int arr[] = {66, 33, 99, 11, 77, 22, 55, 66, 88};
		
		
		System.out.println("Before sort : " + Arrays.toString(arr));
		
		quickSort(arr, 0, arr.length-1);
		
		System.out.println("After sort : " + Arrays.toString(arr));

	}

}
