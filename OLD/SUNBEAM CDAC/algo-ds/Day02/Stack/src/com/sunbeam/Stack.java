package com.sunbeam;

public class Stack {
	private int arr[];
	private int top;
	private final int SIZE;
	public Stack(int size) {
		SIZE = size;
		arr = new int[SIZE];
		top = -1;
	}
	
	public void push(int value) {
		//a. reposition top (inc)
		top++;
		//b. add value at top index
		arr[top] = value;
	}
	
	public int pop() {
		//a. reposition top (dec)
		return arr[top--];
	}
	
	public int peek() {
		//a. read/return data of top index
		return arr[top];
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	
	public boolean isFull() {
		return top == SIZE -1;
	}
	

}











