/**
 * all the left nodes of binary tree
 */
package com.example.collection;

public class Sample20 {

	public static void main(String aaa[]){
		Node node = new Node(5);
		Sample20 sam = new Sample20();
		sam.insert(node, 1);
		sam.insert(node, 7);
		sam.insert(node, 2);
		sam.insert(node, 3);
		sam.insert(node, 8);
		sam.insert(node, 4);
		sam.insert(node, 6);
		sam.lookupExtremeRight(node);

	}

	private static class Node{
		Node left;
		Node right;
		int value;
		public Node(int value){
			this.value=value;
		}
	}

	public void insert(Node node, int value){
		if(value < node.value){
			if(node.left != null){
				insert(node.left,value);
			}
			else{
				System.out.println("Inserting value " + value+ " on left of " + node.value);
				node.left=new Node(value);
			}
		}
		else {
			if(node.right !=null){
				insert(node.right,value);
			}
			else{
				System.out.println("Inserting value " + value + " on right of " + node.value);
				node.right = new Node(value);
			}
		}
	}

	public void lookup(Node node){
		if(node!=null){
			lookup(node.left);
			System.out.println(" Traversed " + node.value);
			lookup(node.right);
		}
	}

	public void lookupExtremeLeft(Node node){
		if(node!=null){
			lookupExtremeLeft(node.left);
			System.out.println(node.value);
		}
	}

	public void lookupExtremeRight(Node node){
		if(node!=null)
		{
			lookupExtremeRight(node.right);
			System.out.println(node.value);
		}
	}
}
