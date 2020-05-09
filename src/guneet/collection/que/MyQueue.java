/*
 * In this approach we are shifting pointer 
 * initially it was pointing to 5, then we shifted its location
 * Drawback, with moment of pointer, size is waster (we are not overriding element of head we are just shifting pointer location)
 */
package guneet.collection.que;

import java.util.ArrayList;
import java.util.List;

public class MyQueue {
	private List<Integer> data;
	private int pointer;
	
	MyQueue(){
		data = new ArrayList<Integer>();
		pointer = 0;
	}
	
	// enqueue
	public Boolean enqueue(int val){
		data.add(val);
		return true;
	}
	//dequeue
	public Boolean dequeue(){
		// if empty, return false
		pointer++;
		return true;
	}
	public void print_first(){
		System.out.println(data.get(pointer));
	}
	
	public static void main(String aaa[]){
		MyQueue q = new MyQueue();
		q.enqueue(5);
		q.enqueue(10);
		q.enqueue(15);
		q.enqueue(20);
		q.enqueue(25);
		q.enqueue(30);
		
		
		q.print_first();
		System.out.println("removing element");
		q.dequeue();
		
		q.print_first();
		System.out.println("removing element");
		q.dequeue();
		
		q.print_first();
	}
}
