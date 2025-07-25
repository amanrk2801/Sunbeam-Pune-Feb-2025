package com.sunbeam;

public class Queue {
	private int arr[];
	private int front, rear;
	private final int SIZE;
	public Queue(int size) {
		SIZE = size;
		arr = new int[SIZE];
		front = rear = -1;
	}
	
	public void push(int value) {
		//a. reposition rear
		rear++;
		//b. add value at rear index
		arr[rear] = value;
	}
	
	public int pop() {
		int value = arr[front + 1];
		//a. reposition front
		front++;
		//return data is to be poped
		return value;
	}
	
	public int peek() {
		//a. read/return data of front + 1 index
		return arr[front + 1];
	}
	
	public boolean isEmpty() {
		return front == rear;
	}
	
	public boolean isFull() {
		return rear == SIZE - 1;
	}
	
}









