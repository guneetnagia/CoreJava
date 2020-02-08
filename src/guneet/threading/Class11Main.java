package guneet.threading;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

public class Class11Main {
	public static void main(String aaa[]) throws InterruptedException{
		BlockingQueue<Class11Token> queue = new LinkedBlockingQueue<>();

		// generate token in thread
		Class11TokenVending tokenVending = new Class11TokenVending(queue);
		Thread t1 = new Thread(tokenVending);
		t1.start();

		//retrieve token in loop - executor service

		ExecutorService executor = Executors.newFixedThreadPool(5);
		CountDownLatch latch = new CountDownLatch(100);
		Class11TokenProcess tokenConsumer = new Class11TokenProcess(queue, latch);
		for (int i = 1; i <= 5; i++) {
			executor.submit(tokenConsumer);
		}
		latch.await();
		System.out.println("Shuting Down");
		executor.shutdown();
	}
}
