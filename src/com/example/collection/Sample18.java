/**
 * Binary tree implementation
 * Tree is used basically for hierarchical data
 * eg. show employees in hierarchical way based on position in company
 * tree has Root is at top and branching out in downward direction
 * logical model
 * collection of entity called nodes linked together in hierarchical way
 * Children of same parents are called sibling
 * leaf nodes are nodes which do not have parents nodes
 * Ancestor of node means all the parent or parent's parent of node
 * cousins nodes are those which do not have same parents but may have same grandparent
 * n nodes .. so n-1 edges
 * Depth of z = length of path from root to x
 * height of x = no of edges in longest path from x to a leaf  (height of tree is height of root)
 *
 * Binary tree is a tree in which each node can have at most 2 children :
 * struct Node{
 * 		int data;
 * 		int leftAdress;
 * 		int rightAddress;
 * }
 *
 * Binary Search tree or ordered binary tree is a type of tree where the nodes are arranged in order. all elements in its left subtree are less-or-equal to the node (<=), and all the elements in its right subtree are greater than the node (>)
 * BST : fast insertion and lookup
 * BST are good for Dictionary
 */

/**
 * Storing naturally hierarchical data eg: file system
 */
package com.example.collection;

public class Sample18 {
	public static void main(String aaa[]){
		BinaryTree bt = new BinaryTree();
		//bt.insert(5);
		Boolean b = bt.lookup(4);
		System.out.println(b);
	}
}

class BinaryTree {
	  // Root node pointer. Will be null for an empty tree.
	  private Node root;


	  /*
	   --Node--
	   The binary tree is built using this nested node class.
	   Each node stores one data element, and has left and right
	   sub-tree pointer which may be null.
	   The node is a "dumb" nested class -- we just use it for
	   storage; it does not have any methods.
	  */
	  private static class Node {
	    Node left;
	    Node right;
	    int data;

	   public Node(int newData) {
	      left = null;
	      right = null;
	      data = newData;
	    }
	  }

	  /**
	   Creates an empty binary tree -- a null root pointer.
	  */
	  public void BinaryTree() {
	    root = null;
	  }


	  /**
	   Returns true if the given target is in the binary tree.
	   Uses a recursive helper.
	  */
	  public boolean lookup(int data) {
	    return(lookup(root, data));
	  }


	  /**
	   Recursive lookup  -- given a node, recur
	   down searching for the given data.
	  */
	  private boolean lookup(Node node, int data) {
	    if (node==null) {
	      return(false);
	    }

	    if (data==node.data) {
	      return(true);
	    }
	    else if (data<node.data) {
	      return(lookup(node.left, data));
	    }
	    else {
	      return(lookup(node.right, data));
	    }
	  }


	  /**
	   Inserts the given data into the binary tree.
	   Uses a recursive helper.
	  */
	  public void insert(int data) {
	    root = insert(root, data);
	  }


	  /**
	   Recursive insert -- given a node pointer, recur down and
	   insert the given data into the tree. Returns the new
	   node pointer (the standard way to communicate
	   a changed pointer back to the caller).
	  */
	  private Node insert(Node node, int data) {
	    if (node==null) {
	      node = new Node(data);
	    }
	    else {
	      if (data <= node.data) {
	        node.left = insert(node.left, data);
	      }
	      else {
	        node.right = insert(node.right, data);
	      }
	    }

	    return(node); // in any case, return the new pointer to the caller
	  }
}