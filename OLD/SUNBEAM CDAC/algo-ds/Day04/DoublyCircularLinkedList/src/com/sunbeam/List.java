package com.sunbeam;

public class List {
	static class Node{
		private int data;
		private Node next;
		private Node prev;
		public Node(int value) {
			data = value;
			next = prev = null;
		}
	}
	
	private Node head;
	private int count;
	public List() {
		head = null;
		count = 0;
	}
	
	public void addFirst(int value) {
		//1. create node
		Node nn = new Node(value);
		//2. if empty
		if(head == null) {
			//a. add newnode into head
			head = nn;
			//b. make list circular
			nn.next = nn.prev = nn;
			
		}
		//3. if not empty
		else {
			//a. add first node into next of newnode
			nn.next = head;
			//b. add last node into prev of newnode
			nn.prev = head.prev;
			//c. add newnode into next of last node
			head.prev.next = nn;
			//d. add newnode into prev of first node
			head.prev = nn;
			//e. move head on newnode
			head = nn;
		}
		count++;
	}
	
	public void addLast(int value) {
		//1. create node
		Node nn = new Node(value);
		//2. if empty
		if(head == null) {
			//a. add newnode into head
			head = nn;
			//b. make list circular
			nn.next = nn.prev = nn;
			
		}
		//3. if not empty
		else {
			//a. add first node into next of newnode
			nn.next = head;
			//b. add last node into prev of newnode
			nn.prev = head.prev;
			//c. add newnode into next of last node
			head.prev.next = nn;
			//d. add newnode into prev of first node
			head.prev = nn;
		}
		count++;
	}
	
	public void addPosition(int value, int pos) {
		// validate the position
		if(pos < 1 || pos > count + 1) {
			System.out.println("Invalid position");
			return;
		}
		//0. create node
		Node nn = new Node(value);
		//1. if empty
		if(head == null) {
			//a. add newnode into head
			head = nn;
			//b. make list circular
			nn.next = nn.prev = nn;
		}
		else if(pos == 1) {
			addFirst(value);
			return;
		}
		//2. if not empty
		else {
			//a. traverse till pos-1 node
			Node trav = head;
			for(int i = 1 ; i < pos - 1 ; i++)
				trav = trav.next;
			
			//b. add pos node into next of newnode
			nn.next = trav.next;
			//c. add pos-1 node into prev of newnode
			nn.prev = trav;
			//d. add newnode into next of pos-1node
			trav.next = nn;
			//e. add newnode into prev of pos node
			nn.next.prev = nn;
		}
	}
	
	public void deleteFirst() {
		//1. if empty
		if(head == null)
			return;
		//2. if single node
		else if(head.next == head)
			head = null;
		//3. if multiple nodes
		else {
			//a. add second node into next of last node
			head.prev.next = head.next;
			//b. add last node into prev of second node
			head.next.prev = head.prev;
			//c. move head on second node
			head = head.next;
		}
		count--;
	}
	
	public void deleteLast() {
		//1. if empty
		if(head == null)
			return;
		//2. if single node
		else if (head.next == head)
			head = null;
		//3. if multiple nodes
		else {
			//a. add second last node into prev of first node
			head.prev = head.prev.prev;
			//b. add first node into next of second last node
			head.prev.next = head;
		}
		count--;
	}
	
	public void deletePosition(int pos) {
		// validate position
		if(pos < 1 || pos > count) {
			System.out.println("Invalid position");
			return;
		}
		//1. if empty
		if(head == null)
			return;
		//2. if single node
		else if(head.next == head)
			head = null;
		else if(pos == 1) {
			deleteFirst();
			return;
		}
		//3. if multiple nodes
		else {
			//a. traverse till pos node
			Node trav = head;
			for(int i = 1 ; i < pos ; i++)
				trav = trav.next;
			//b. add pos+1 node into next of pos-1 node
			trav.prev.next = trav.next;
			//c. add pos-1 node into prev of pos+1 node
			trav.next.prev = trav.prev;
		}
		count--;
	}
	
	public void fDisplay() {
		// if list is empty
		if(head == null)
			return;
		//1. create a trav and start at first node
		Node trav = head;
		System.out.print("Forward List :: ");
		do {
			//2. print data of current node (trav.data)
			System.out.print(" " + trav.data);
			//3. go on next node
			trav = trav.next;
		}while(trav != head);//4. repeat step 2 and 3 till last node
		System.out.println("");
	}
	
	public void rDisplay() {
		// if list is empty
		if(head == null)
			return;
		//1. create a trav and start at last node
		Node trav = head.prev;
		System.out.print("Reverse List :: ");
		do {
			//2. print data of current node (trav.data)
			System.out.print(" " + trav.data);
			//3. go on prev node
			trav = trav.prev;
		}while(trav != head.prev);//4. repeat step 2 and 3 till first node
		System.out.println("");
	}
	
	public int size() {
		return count;
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public void deleteAll() {
		head = null;
		count = 0;
	}
}











