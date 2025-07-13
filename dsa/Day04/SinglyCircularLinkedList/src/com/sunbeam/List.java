package com.sunbeam;

public class List {
	static class Node{
		private char data;
		private Node next;
		public Node(char value) {
			data = value;
			next = null;
		}
	}
	
	private Node head;
	private Node tail;
	
	public List() {
		head = tail = null;
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public void addFirst(char value) {
		//1. craete newnode
		Node newnode = new Node(value);
		//2. if list is empty
		if(head == null) {
			//a. add newnode into head and tail
			head = tail = newnode;
			//b. make list circular
			tail.next = head;
		}
		//3. if list is not empty
		else {
			//a. add first node into next of newnode
			newnode.next = head;
			//b. add newnode into next of last node
			tail.next = newnode;
			//c. move head on newnode 
			head = newnode;
		}
	}
	
	public void addLast(char value) {
		//1. craete newnode
		Node newnode = new Node(value);
		//2. if list is empty
		if(head == null) {
			//a. add newnode into head and tail
			head = tail = newnode;
			//b. make list circular
			tail.next = head;
		}
		//3. if list is not empty
		else {
			//a. add first node into next of newnode
			newnode.next = head;
			//b. add newnode into next of last node
			tail.next = newnode;
			//c. move tail on newnode 
			tail = newnode;
		}
	}
	
	public void deleteFirst() {
		//1. if list is empty
		if(head == null)
			return;
		//2. if list has single node
		else if(head == tail)
			head = tail = null;
		//3. if list has multiple nodes
		else {
			//a. add second node into next of last node
			tail.next = head.next;
			//b. move head on second node
			head = head.next;
		}
	}
	
	public void deleteLast() {
		//1. if list is empty
		if(head == null)
			return;
		//2. if list has single node
		else if(head == tail)
			head = tail = null;
		//3. if list has multiple nodes
		else {
			//a. traverse till second last node
			Node trav = head;
			while(trav.next.next != head)		// while(trav.next != tail)
				trav = trav.next;
			//b. add first node into next of second last node
			trav.next = head;
			//c. move tail on second last node
			tail = trav;
		}
	}
	
	public void display() {
		//1. if list is empty
		if(head == null)
			return;
		//2. if list is not empty
		System.out.print("List : ");
		//2.1 create trav and start at head
		Node trav = head;
		do {
			//2.2 print current node
			System.out.print(" " + trav.data);
			//2.3 go on next node
			trav = trav.next;
		}while(trav != head); //2.4 repeat above 2 steps till last node
		System.out.println("");
	}
	
	public void deleteAll() {
		head = tail = null;
	}
}













