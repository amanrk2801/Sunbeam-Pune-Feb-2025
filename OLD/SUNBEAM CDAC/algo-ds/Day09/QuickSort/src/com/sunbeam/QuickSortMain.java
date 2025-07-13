package com.sunbeam;

import java.util.Arrays;

public class QuickSortMain {
	
	public static void quickSort(int arr[], int left, int right) {
		//0. stop if invalid partition or single element partition
		if(left >= right)
			return;
		//1. decide pivot/reference/axis element from array  -- arr[left]
		//int pivot = arr[left];
		//2. arrange all smaller elements than pivot on left side of the pivot
		//3. arrange all higher elements than pivot on right side of the pivot
		int i = left, j = right;
		while(i < j) {
			//3.1 find element greater than pivot
			for( ; i <= right && arr[i] <= arr[left] ; i++);
			//3.2 find element smaller or equal than pivot
			for( ; arr[j] > arr[left] ; j--);
			//3.3 if i and j are not crossed then swap ith and jth element
			if(i < j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		//3.4 if i and j are crossed then swap pivot and jth element
		int temp = arr[left];
		arr[left] = arr[j];
		arr[j] = temp;
		//4. sort left and right partitions of pivot individually by same method
		quickSort(arr, left, j-1);
		quickSort(arr, j+1, right);
	}

	public static void main(String[] args) {
		int arr[] = {66, 33, 99, 11, 77, 22, 55, 66, 88};
		
		System.out.println("Array before sort :: " + Arrays.toString(arr));

		quickSort(arr, 0, arr.length-1);
		
		System.out.println("Array after sort :: " + Arrays.toString(arr));
	}

}
