package online.cts;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable{
	public BlockingQueue<Object> queue;
	
	public Consumer(BlockingQueue<Object> queue){
		this.queue = queue;
	}
	@Override
	public void run() {
		try{
			while(true){
				Object obj = queue.take();
				System.out.println("Consumed value from queue : " + obj);
				System.out.println("Queue size after consume : " +queue.size());
				take(obj);
			}
		}
		catch(InterruptedException e1){
			e1.printStackTrace();
		}
		
	}
	
	void take(Object obj){
		try{
			Thread.sleep(100);
		}
		catch(InterruptedException e){
			System.out.println("Someone interrrupted consumer" );
		}
		System.out.println("consuming data");
	}

}
