package com.sunbeam;

import java.util.Arrays;

public class InsertionSortMain {
	
	public static void insertionSort(int arr[], int N) {
		for(int i = 1 ; i < N ; i++) {
			//1. pick one element(start from seccond position) from array
			int temp = arr[i];
			//2. compare picked element with all its left neighbours one by one
			int j = i - 1;
			while(j >= 0 && arr[j] > temp) {
				//3. if left neighbour is greater than picked element then move left neighbour one position ahead
				arr[j+1] = arr[j];
				j--;
			}
			//4. insert picked element at its appropriate position
			arr[j+1] = temp;
		}//5. repeat above steps untill array is sorted
	}

	public static void main(String[] args) {
		int arr[] = {55, 44, 22, 66, 11, 33};
		
		System.out.println("Array before sort : " + Arrays.toString(arr));

		insertionSort(arr, arr.length);
			
		System.out.println("Array after sort : " + Arrays.toString(arr));
	}

}
