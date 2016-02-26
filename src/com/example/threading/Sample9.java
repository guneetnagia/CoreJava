/**
 * Countdown latches
 */
package com.example.threading;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Sample9 {
	public static void main(String aaa[]){
		CountDownLatch latch = new CountDownLatch(3);   //Thread safe class;
		ExecutorService executor = Executors.newFixedThreadPool(3);
		for(int i=0;i<10;i++){
			executor.submit(new Processor2(latch));
		}
		try{
			latch.await();
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}

		System.out.println("completed");
	}
}
class Processor2 implements Runnable{
	private CountDownLatch latch;

	public Processor2(CountDownLatch latch){
		this.latch=latch;
	}
	public void run(){
		System.out.println("started ... ");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		latch.countDown();
	}
}