package com.sunbeam;

import java.util.Arrays;

public class MergeSortMain {
	
	public static void mergeSort(int arr[], int left, int right) {
		//0. stop if partition is invalid or partition has single element
		if(left >= right)
			return;
		//1. divide array into two partitions
		int mid = (left + right) / 2;
		//2. sort both partitions individually
		mergeSort(arr, left, mid);
		mergeSort(arr, mid + 1, right);
		//3. merge both partitions into temp array
		int size = (right - left) + 1;
		int temp[] = new int[size];
		int i = left, j = mid + 1, k = 0;
		while(i <= mid && j <= right) {
			// compare ith and jth element
			if(arr[i] < arr[j]) {
				// put ith element into temp array
				temp[k] = arr[i];
				k++;
				i++;
			}
			else {
				// put jth element into temp array
				temp[k] = arr[j];
				k++;
				j++;
			}
		}
		// if right partition is finished, put remaining elements from left partition into temp
		while(i <= mid) {
			temp[k] = arr[i];
			k++;
			i++;
		}
		// if left partition is finished, put remaining elements from right partition into temp
		while(j <= right) {
			temp[k] = arr[j];
			k++;
			j++;
		}
		//4. over write temp array into original
		for(i = 0 ; i < size ; i++)
			arr[left + i] = temp[i];
	}

	public static void main(String[] args) {
		int arr[] = {6, 1, 9, 7, 3, 8, 2, 4, 5};
		
		System.out.println("Array before sort : " + Arrays.toString(arr));
		
		mergeSort(arr, 0, arr.length-1);
		
		
		System.out.println("Array after sort : " + Arrays.toString(arr));

	}

}
