package guneet.collection.que;
/*
 * Circluar queue is linear data structure, maintains FIFO and last poistion is connected to first position making a circle
 * Disadvantage of normal queue is, lot of space is wasted, since we move head pointer on dequeue which waste spaces in front.
 *  
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*	MyCircularQueue(k): Constructor, set the size of the queue to be k.
	Front: Get the front item from the queue. If the queue is empty, return -1.
	Rear: Get the last item from the queue. If the queue is empty, return -1.
	enQueue(value): Insert an element into the circular queue. Return true if the operation is successful.
	deQueue(): Delete an element from the circular queue. Return true if the operation is successful.
	isEmpty(): Checks whether the circular queue is empty or not.
	isFull(): Checks whether the circular queue is full or not.*/


class MyCircularQueue<E>{
	E[] list;
	int front, rear;
	int size;
	int currentSize;
	MyCircularQueue(int maxSize){
		size = maxSize;
		list = (E[]) new Object[maxSize];
		front = -1;
		rear=-1;
		currentSize=0;
	}
	@Override
	public String toString(){
		return Arrays.toString(list);
	}
	public Boolean isEmpty(){
		return (currentSize == 0);
	}
	public Boolean isFull(){
		return currentSize == list.length;
	}
	public void enQueue(E value) throws Exception{
		if(isFull()){
			throw new Exception("Queue is full");
		}
		else{
			rear  = (rear+1)%list.length;
			list[rear] = value;
			currentSize++;
			if(front == -1){
				front = rear;
			}
		}
	}
	public E deQueue() throws Exception{
		E currentVal;
		if(isEmpty()){
			throw new Exception("Queue is Empty");
		}
		else{
			currentVal = list[front];
			list[front] = null;
			front = (front+1)%list.length;
			currentSize--;
		}
		return currentVal;
	}

	public static void main(String args[]) throws Exception{
		MyCircularQueue<Integer> obj = new MyCircularQueue<Integer>(8);
		obj.enQueue(15);
		obj.enQueue(16);
		obj.enQueue(17);
		obj.enQueue(18);
		obj.enQueue(19);
		obj.enQueue(20);
		obj.enQueue(21);
		obj.enQueue(22);
		System.out.println("Full Circular Queue" + obj);

       System.out.print("Dequeued following element from circular Queue ");
       System.out.println(obj.deQueue() + " ");
       obj.enQueue(23);
        System.out.println("After enqueueing circular queue with element having value 23");
        System.out.println(obj);
	}
}
