package com.sunbeam;

public class Queue {
	private int arr[];
	private int front, rear;
	private final int SIZE;
	public Queue(int size) {
		SIZE = size;
		arr = new int[size];
		front = rear = -1;
	}
	
	public void push(int value) {
		if(isFull()) {
			System.out.println("Queue is full");
			return;
		}
		//a. reposition rear
		rear = (rear + 1) % SIZE;		// change
		//b. add value at rear index
		arr[rear] = value;
	}
	
	public int pop() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
			return -1;
		}
		int value = arr[(front + 1) % SIZE];
		//a. reposition front
		front = (front + 1) % SIZE;
		// if queue is empty then move front and rear at -1
		if(front == rear)
			front = rear = -1;
		
		return value;
	}
	
	public int peek() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
			return -1;
		}
		//a. read/return data of front + 1 index
		return arr[(front + 1) % SIZE];
	}
	
	public boolean isEmpty() {
		return front == rear && rear == -1;
	}
	
	public boolean isFull() {
		return (front == -1 && rear == SIZE-1) ||  (front == rear && rear != -1);
	}
	
}



















