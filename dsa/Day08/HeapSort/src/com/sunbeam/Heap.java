package com.sunbeam;

public class Heap {
	private int SIZE;
	public Heap() {
		SIZE = 0;
	}

	
	public void createHeap(int arr[]) {
		//0. add all elements into heap one by one
		for(int i = 1 ; i < arr.length ; i++) {
			//1. increment size of heap by one
			SIZE++;
			//2. adjust the position of newly added element
			int ci = SIZE;
			int pi = ci / 2;
			while(pi >= 1) {
				//3. if parent is alreay greater then break loop
				if(arr[pi] > arr[ci])
					break;
				//4. if parent is less than child then swap
				int temp = arr[pi];
				arr[pi] = arr[ci];
				arr[ci] = temp;
				//5. update indices of parent and child
				ci = pi;
				pi = ci / 2;
			}
		}
	}
	
	public void deleteHeap(int arr[]) {
		//0. delete all elements from heap one by one
		for(int i = 1 ; i < arr.length ; i++) {
			//1. swap first and last element of heap
			int max = arr[1];
			arr[1] = arr[SIZE];
			arr[SIZE] = max;
			//2. decrement size of heap by one
			SIZE--;
			//3. adjust position ot root element
			int pi = 1;
			int ci = pi * 2;
			while(ci <= SIZE) {
				//1. find index of maximum child of pi
				if(ci + 1 <= SIZE && arr[ci + 1] > arr[ci])
					ci = ci + 1;
				//2. if parent is greater than max child then break
				if(arr[pi] > arr[ci])
					break;
				//3. if parent is less than  max child then swap
				int temp = arr[ci];
				arr[ci] = arr[pi];
				arr[pi] = temp;
				//4. update indices of parent and child
				pi = ci;
				ci = pi * 2;
			}
		}
	}
	
	public void heapSort(int arr[]) {
		//1. create heap from given array
		createHeap(arr);
		//2. delete all elements from heap and add them from right side
		deleteHeap(arr);
	}
}













