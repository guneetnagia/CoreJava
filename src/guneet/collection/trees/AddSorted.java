package guneet.collection.trees;
class Node1{
	int value;
	Node1 right, left;
	public Node1(int value){
		left = right = null;
		this.value = value;
	}
}
public class AddSorted {

	public Node1 addRecursive(Node1 current, int value){
		if(current == null){
			return new Node1(value);
		}
		if(value>current.value){
			current.left = addRecursive(current.left, value);
		}
		else if(value<current.value) {
			current.right = addRecursive(current.right, value);
		}else {
			return current;
		}
		return current;
	}
	Node1 root;
	public void add(int value) {
	    root = addRecursive(root, value);
	}
	
	public static void main(String aaa[]){
		AddSorted as = new AddSorted();
		as.add(6);
		as.add(4);
	    as.add(8);
	    as.add(3);
	    as.add(5);
	    as.add(7);
	    as.add(9);
	}
}
