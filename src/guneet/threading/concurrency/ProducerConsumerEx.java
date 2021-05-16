package guneet.threading.concurrency;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ProducerConsumerEx {
	private ReentrantLock lock = new ReentrantLock(true);
	private Condition full = lock.newCondition();
	private Condition empty = lock.newCondition();
	private Queue<Integer> queue;
	private int max = 0;
	
	public ProducerConsumerEx(int max){
		queue = new LinkedList<>();
		this.max = max;
	}
	public void put(int e){
		if(queue.size()== max){
			
		}
		try{
			lock.lock();
			queue.add(e);
		}
		finally{
			lock.unlock();	
		}
	}
	public int get(){
		int val =0;
		if(queue.size()==0){
			
		}
		try{
			lock.lock();
			val = queue.remove();
		}
		finally{
			lock.unlock();
		}
		return val;
		
	}
	
	public static void main(String args[]){
		ProducerConsumerEx pc = new ProducerConsumerEx(16);
	}
	
}

