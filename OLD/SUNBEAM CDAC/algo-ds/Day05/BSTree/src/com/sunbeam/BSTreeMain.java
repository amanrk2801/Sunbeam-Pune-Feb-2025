package com.sunbeam;

public class BSTreeMain {

	public static void main(String[] args) {
		
		BSTree bst = new BSTree();
		
		bst.addNode(8);
		bst.addNode(3);
		bst.addNode(10);
		bst.addNode(6);
		bst.addNode(1);
		bst.addNode(14);
		bst.addNode(13);
		bst.addNode(7);
		bst.addNode(4);
		/*
		bst.preorder();
		bst.inorder();
		bst.postorder();
		
		BSTree.Node ret =  bst.binarySearch(15);
		if(ret == null)
			System.out.println("Key is not found");
		else
			System.out.println("Key is found");
			
		*/
		/*
		bst.inorder();
		bst.deleteNode(8);
		bst.inorder();
		 */
		
		bst.DFSTraversal();
		bst.BFSTraversal();
		
		System.out.println("Height : " + bst.height());
	}

}










