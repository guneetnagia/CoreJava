package guneet.collection.que;

public class CircularQueue {
	int queue[];
	int front;
	int rear;
	int size;
	public CircularQueue(int size){
		this.queue = new int[size];
		this.front = 1;
		this.rear = -1;
		this.size = size;
	}
	public void enqueue(int number){
		if((rear == size-1 && front == 0) || rear == front-1){
			System.out.println("Queue is Full");
		}
		else if(rear == -1){ //Queue is empty
			rear = 0;
			front = 0;
			queue[rear] = number;
			System.out.println("Added " + queue[rear] + " at " +rear);
		}
		else if(rear == size-1 && front != 0){
			rear = 0;
			queue[rear] = number;
			System.out.println("Added " + queue[rear] + " at " +rear);
		}
		else{
			rear = rear + 1;
			queue[rear] = number;
			System.out.println("Added " + queue[rear] + " at " +rear);
		}
	}
	
	public int dequeue(){
		if(front == -1){
			System.out.println("Queue is Empty");
			return -1;
		}
		int temp = queue[front];
		System.out.println("Removed " + queue[front] + " from " + front);
		if(front == rear){
			front = -1;
			rear = -1;
		}
		else if(front == size - 1){
			front = 0;
		}
		else{
			front = front + 1;
		}
		return temp;
	}
}
