package guneet.collection.stacks;

class Node {
	int data;
	Node next;
	public Node(int d){
		this.data = d;
		this.next = null;
	}
}
public class StackLinkListImpl {

	Node head = null;
	StackLinkListImpl(){
		
	}
	
	public void push(int data){
		Node n = new Node(data);
		n.next = head;
		this.head = n;
	}
	public void display(){
		if(head == null)
			System.out.println("Stack is Empty");

		Node temp = this.head;
		while(temp !=null){
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	public int pop(){
		if(head == null){
			System.out.println("Stack is Empty, Can;t pop");
			return 0;
		}
		Node temp = head;
		head = head.next;
		return temp.data;
	}
}
