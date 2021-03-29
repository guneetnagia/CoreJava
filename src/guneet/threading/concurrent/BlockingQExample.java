package guneet.threading.concurrent;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQExample {
	public static void main(String args[]){
		BlockingQueue<String> queue = new ArrayBlockingQueue<>(5);
		Consumer c = new Consumer(queue);
		new Thread(c).start();
		Producer p = new Producer(queue);
		new Thread(p).start();
		Producer p1 = new Producer(queue);
		new Thread(p1).start();
	}
}

class Producer implements Runnable{
	BlockingQueue<String> queue;

	public Producer(BlockingQueue<String> queue){
		this.queue = queue;
	}

	@Override
	public void run(){
		for(int i=0;i<20;i++){
			try {
				Thread.sleep(1000);
				queue.put("String"+i);
				System.out.println("Added string " + i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}


class Consumer implements Runnable{

	BlockingQueue<String> queue;
	public Consumer(BlockingQueue<String> queue){
		this.queue = queue;
	}
	@Override
	public void run() {
		while(true){
			try {
				System.out.println(queue.take());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}