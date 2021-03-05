package guneet.collection.trees;
class Node{
	int key;
	Node right,left;
	
	public Node(int item){
		key = item;
		left=right=null;
	}
}
public class Example1 {
	Node root;
	
	Example1(int key){
		root = new Node(key);
	}
	
	Example1(){
		root = null;
	}
	
	public static void main(String args[]){
		//String s = new String(null);
		Example1 tree = new Example1();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
	}
}
