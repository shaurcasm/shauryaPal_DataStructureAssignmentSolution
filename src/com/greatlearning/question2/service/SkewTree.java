package com.greatlearning.question2.service;

public class SkewTree {
	public Node node;
	public Node anchor = null;
	Node previous = null;
	
	public void skewFromRoot(Node root) {
		if (root == null)
			return;
		
		Node rightNode = root.right;
		// Traverse left
		skewFromRoot(root.left);
		
		// Set leftmost as anchor and previous, move up and for other roots set previous.right as the root and .left as null, then set previous as the root and move on. 
		if(anchor == null) {
			anchor = root;
			root.left = null;
			previous = root;
		} else {
			previous.right = root;
			root.left = null;
			previous = root;
		}
		
		skewFromRoot(rightNode);
	}
	
	public void displayTree(Node root) {
		if (root == null)
			return;
		
		displayTree(root.left);
		System.out.print(root.data + " ");
		displayTree(root.right);
	}
}
