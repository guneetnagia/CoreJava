package online.cts;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;


public class PCMain {
	public static void main(String aaaa[]){
		int producer = 5;
		int consumer = 5;
		
		BlockingQueue<Object> myQueue = new LinkedBlockingQueue<Object>();
		
		for(int i=0;i<producer;i++){
			String producer_name = "producer"+i;
			new Thread(new Producer(producer_name,myQueue)).start();
		}
		
		for(int i=0;i<consumer;i++){
			String consumer_name = "consumer"+i;
			Thread t = new Thread(new Consumer(myQueue));
			t.start();
		}
	}
}
