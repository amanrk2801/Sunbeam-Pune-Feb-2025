package com.sunbeam;

import java.util.Arrays;

public class MergeSortMain {
	
	public static void mergeSort(int arr[], int left, int right) {
		//0. stop if invalid partition or partition contains single element
		if(left >= right)
			return;
		//1. divide array into two parts
		int mid = (left + right)/2;
		//2. sort both partitions individually
		mergeSort(arr, left, mid);		// left partition
		mergeSort(arr, mid+1, right);	// right partition
		//3. merge both sorted partitions into temp array
		int i = left, j = mid + 1 , k = 0;
		int size = right - left + 1;
		int temp[] = new int[size];
		while(i <= mid && j <= right) {
			if(arr[i] < arr[j]) {
				temp[k] = arr[i];
				k++;
				i++;
			}
			else {
				temp[k] = arr[j];
				k++;
				j++;
			}
		}
		while(i <= mid) {
			temp[k] = arr[i];
			k++;
			i++;
		}
		while(j <= right) {
			temp[k] = arr[j];
			k++;
			j++;
		}
		//4. overwrite temp array into original array
		for(i = 0 ; i < size ; i++)
			arr[left + i] = temp[i];
	}

	public static void main(String[] args) {
		int arr[] = {6, 1, 9, 7, 3, 8, 2, 4, 5};
		
		System.out.println("Array before sort :: " + Arrays.toString(arr));

		mergeSort(arr, 0, arr.length-1);
		
		System.out.println("Array after sort :: " + Arrays.toString(arr));
	}

}
