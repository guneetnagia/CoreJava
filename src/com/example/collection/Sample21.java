/**
 * Serialize de-serialize Binary tree
 */
package com.example.collection;

import java.io.File;
import java.io.IOException;

public class Sample21 {
	public static void main(String aaa[]){
		Node node = new Node(30);
		Sample21 sam = new Sample21();
		sam.insert(node,10);
		sam.insert(node,35);
		sam.insert(node,50);
		sam.insert(node,45);
		sam.insert(node,20);
	}

	private static class Node{
		Node left;
		Node right;
		int value;
		public Node(int value){
			this.value = value;
		}
	}

	public void insert(Node node,int value){
		if(value <= node.value){
			if(node.left!=null){
				insert(node.left,value);
			}
			else{
				System.out.println(" Inserted value " + value + " on left of " + node.value);
				node.left = new Node(value);
			}
		}
		else if(value > node.value){
			if(node.right!=null){
				insert(node.right,value);
			}
			else{
				System.out.println(" Inserted value " + value + " on right of " + node.value);
				node.right = new Node(value);
			}
		}
	}

	public void serializeTree(Node node){
		File file = new File("C:\\Users\\333995.TCSGEGDC");
		try {
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		if(node!=null){

		}
	}
}
