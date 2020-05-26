package guneet.collection.que;
/*
 * Circluar queue is linear data structure, maintains FIFO and last poistion is connected to first position making a circle
 * Disadvantage of normal queue is, lot of space is wasted, since we move head pointer on dequeue which waste spaces in front.
 *  
 */

class MyCircularQueue{
	int[] list;
	int rear, front, maxSize;
	/** Initialize your data structure here. Set the size of the queue to be k. */
	public MyCircularQueue(int k) {
		maxSize = k;
		list = new int[k];
		front = -1;
		rear = -1;
	}

	/** Insert an element into the circular queue. Return true if the operation is successful. */
	public boolean enQueue(int value) {
		if(isFull()){
			return false;
		}
		if(isEmpty()){
			front = 0;
		}
		rear = (rear+1)%maxSize;
		list[rear] = value;
		return true;
	}

	/** Delete an element from the circular queue. Return true if the operation is successful. */
	public boolean deQueue() {
		if(isEmpty()){
			return false;
		}
		if(front == rear){
			front = -1;
			rear = -1;
			return true;
		}
		front = (front+1)%maxSize;
		return true;
	}

	/** Get the front item from the queue. */
	public int Front() {
		if(isEmpty()){
			return -1;
		}
		return list[front];
	}

	/** Get the last item from the queue. */
	public int Rear() {
		if(isFull()){
			return -1;
		}
		return list[rear];
	}

	/** Checks whether the circular queue is empty or not. */
	public boolean isEmpty() {
		return (front == -1);
	}

	/** Checks whether the circular queue is full or not. */
	public boolean isFull() {
		return ((rear+1) % maxSize == front);
	}

	public static void main(String args[]) throws Exception{
		MyCircularQueue circularQueue = new MyCircularQueue(8);
		System.out.println(circularQueue.enQueue(1));  // return true
		System.out.println(circularQueue.enQueue(2));  // return true
		System.out.println(circularQueue.enQueue(3));  // return true
		System.out.println(circularQueue.enQueue(4));  // return false, the queue is full
		System.out.println(circularQueue.Rear());  // return 3
		System.out.println(circularQueue.isFull());  // return true
		System.out.println(circularQueue.deQueue());  // return true
		System.out.println(circularQueue.enQueue(4));  // return true
		System.out.println(circularQueue.Rear());  // return 4
		
	}
}
