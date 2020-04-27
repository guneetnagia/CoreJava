package guneet.collection.trees;


public class DepthFirstSearch {
	
	Node root;
	public DepthFirstSearch(){
		root = null;
	}
	public void preorder(Node node){
		if(node == null){
			return;
		}
		System.out.println(node.key+" ");
		preorder(node.left);
		preorder(node.right);
	}
	void printPreOrder(){
		preorder(root);
	}
	public static void main(String aaa[]){
		DepthFirstSearch tree = new DepthFirstSearch();
		tree.root = new Node(1); 
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		
		
		System.out.println("Preorder traverse");
		tree.printPreOrder();
	}
}
