package guneet.collection.que;

public class CircularQueueMain {
	public static void main(String aaa[]){
		CircularQueue cq = new CircularQueue(4);
		cq.enqueue(3);
		cq.enqueue(6);
		cq.enqueue(9);
		cq.enqueue(12);
		cq.enqueue(15);
		cq.enqueue(18);
		cq.dequeue();
		cq.dequeue();
		cq.dequeue();
		cq.dequeue();
		cq.dequeue();
		}
}
