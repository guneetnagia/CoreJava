/**
 *
 */
package com.example.collection;

public class Sample29 {

	static class Node{
		Node left;
		Node right;
		int value;
		public Node(int value){
			this.value=value;
		}
	}

	public static void main(String[] args) {
		new Sample29().run();
	}

	public void run(){
		Node root = new Node(5);
		insert(root,1);insert(root,3);insert(root,13);insert(root,11);insert(root,6);
		printFrontToBack(root,5);
	}

	public void insert(Node node, int value){
		if(value < node.value){
			if(node.left != null){
				insert(node.left,value);
			}
			else{
				System.out.println("inserting " + value + " is insert in left of " + node.value) ;
				node.left = new Node(value);
			}
		}
		else if (value > node.value){
			if(node.right !=null){
				insert(node.right,value);
			}
			else{
				System.out.println("inserting " + value + " is insert in right of " + node.value) ;
				node.right=new Node(value);
			}
		}
	}

	public void printAll(Node node){
		if(node!=null){
			printAll(node.left);
			System.out.println("Traversed " + node.value);
			printAll(node.right);
		}
	}
	public void printFrontToBack(Node node, int camera){
		if (node == null)
		      return;
		    if (node.value > camera) {
		      // print in order
		      printFrontToBack(node.left, camera);
		      System.out.println("  Traversed " + node.value);
		      printFrontToBack(node.right, camera);
		    } else if (node.value < camera) {
		      // print reverse order
		      printFrontToBack(node.right, camera);
		      System.out.println("  Traversed " + node.value);
		      printFrontToBack(node.left, camera);
		    } else {
		      // order doesn't matter
		      printFrontToBack(node.left, camera);
		      printFrontToBack(node.right, camera);
		    }
	}
}

