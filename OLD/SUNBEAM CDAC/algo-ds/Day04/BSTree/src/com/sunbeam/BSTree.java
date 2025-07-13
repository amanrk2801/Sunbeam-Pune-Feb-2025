package com.sunbeam;

public class BSTree {
	static class Node{
		private int data;
		private Node left;
		private Node right;
		public Node(int value) {
			data = value;
			left = right = null;
		}
	}
	
	private Node root;
	public BSTree() {
		root = null;
	}
	
	public boolean isEmpty() {
		return root == null;
	}
	
	public void addNode(int value) {
		//1. create node for given value
		Node newnode = new Node(value);
		//2. if tree is empty
		if(isEmpty())
			// add newnode into root itself
			root = newnode;
		//3. if tree is not empty
		else {
			//3.1 create trav and start at root node
			Node trav = root;
			while(true) {
				//3.2 check if value is less than current data
				if(value < trav.data) {
					//3.2.1 if left of current node is empty
					if(trav.left == null) {
						// add newnode into left of current node
						trav.left = newnode;
						break;
					}
					//3.2.2 if left of current node is not empty
					else
						// go to the left of current node
						trav = trav.left;
				}
				//3.3 check if value is greater or equal to data
				else {
					//3.3.1 if right of current node is empty
					if(trav.right == null) {
						// add newnode into right of current node
						trav.right = newnode;
						break;
					}
					//3.3.2 if right of current node is not empty
					else
						// go to the right of current node
						trav = trav.right;
				}
			}//3.4 repeat step 3.2 and 3.3 untill node is added
		}
	}
	
	public void preorder(Node trav) {
		if(trav == null)
			return;
		System.out.print(" " + trav.data);
		preorder(trav.left);
		preorder(trav.right);
	}
	
	public void preorder() {
		System.out.print("Preorder :: ");
		preorder(root);
		System.out.println("");
	}
	
	
	public void deleteAll() {
		root = null;
	}
}















