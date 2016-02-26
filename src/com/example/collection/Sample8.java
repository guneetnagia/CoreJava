/**
 * BlockingQueue is thread safe
 * One thread putting into and another thread taking from Blocking Queue
 * The producer keep producing new Objects until queue reached some upper limit and it remain blocked until consumer thread consumes Objects out of queue.
 * Similarly consumer thread is keep getting objects from queue until it queue is empty and after that it will be blocked until producer thread put new object in queue
 * null cannot be inserted in blocking Queue
 * BlockingQueue interface has implementation classes as ArrayBlockingQueue, DelayQueue, LinkedBlockingQueue, PriorityBlockingQueue,SynchronousQueue
 */
package com.example.collection;

import java.util.concurrent.*;
public class Sample8 {
	public static void main(String p[]){
		BlockingQueue<String> qu = new ArrayBlockingQueue<String>(1024);
	}
}
