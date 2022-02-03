package com.greatlearning.question2.main;

import com.greatlearning.question2.service.Node;
import com.greatlearning.question2.service.SkewTree;

public class Main {
		
	public static void main(String[] args) {
		SkewTree skewTree = new SkewTree();
		
		skewTree.node = new Node(50);
		skewTree.node.left = new Node(30);
		skewTree.node.right = new Node(60);
		skewTree.node.left.left = new Node(10);
		skewTree.node.right.left = new Node(55);
		
		skewTree.skewFromRoot(skewTree.node);
		skewTree.displayTree(skewTree.anchor);

	}

}
