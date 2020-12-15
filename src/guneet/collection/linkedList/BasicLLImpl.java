package guneet.collection.linkedList;

class Node{
	String data;
	Node next;
	public Node(String data){
		this.data = data;
		this.next = null;
	}
}
public class BasicLLImpl {
	
	Node head = null;
	public String delete_start(){
		if(head == null){
			System.out.println("Cannot delete as queue is empty");
			return "--";
		}
		Node temp = head;
		head = head.next;
		System.out.println("Deleted from Start " + temp.data);
		return temp.data;
	}
	
	public void add_start(String data){
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
		System.out.println("Adding at Start " + newNode.data);
	}
	
	public void add_position(int position, String data){
		Node newNode = new Node(data);
		Node temp = head;
		int count = 1;
		while(temp != null && count < position-1){
			temp = temp.next;
			count++;
		}
		Node current = temp.next;
		newNode.next = current;
		temp.next = newNode;
	}
	
	Node add_end(String data){
		Node newNode = new Node(data);
        if(head == null){
            return newNode;
        }
		Node temp = head;
		while(head.next!=null){
			head = head.next;
		}
		head.next = newNode;
        return temp;
	}
}
