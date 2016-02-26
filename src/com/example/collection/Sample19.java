package com.example.collection;

public class Sample19 {
	public static void main(String aaa[]){
		Node root = new Node(5);
		Sample19 bts=new Sample19();
		bts.insert(root, 4);
		bts.insert(root, 1);
		bts.insert(root, 2);
		bts.insert(root, 3);
		bts.insert(root, 6);
		bts.insert(root, 9);
		bts.printInOrder(root);
	}

	private static class Node{
		Node left;
		Node right;
		int value;

		public Node(int value){
			this.value=value;
		}
	}

	public void insert(Node node,int value){
		if(value < node.value){
			if(node.left != null){
				insert(node.left,value);
			}else{
				System.out.println(" Inserted value " + value +" to the left of " + node.value);
				node.left=new Node(value);
			}
		}
		else if(value > node.value){
			if(node.right!=null){
				insert(node.right,value);
			}
			else{
				System.out.println(" Inserted value " + value + " to the right of " + node.value);
				node.right = new Node(value);
			}
		}

	}

	public void printInOrder(Node node){
		if(node!=null){
			printInOrder(node.left);
			System.out.println(" Traversed " + node.value);
			printInOrder(node.right);
		}
	}

}
