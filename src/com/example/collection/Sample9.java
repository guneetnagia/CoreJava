/**
 * Producer class
 */

package com.example.collection;

import java.util.concurrent.BlockingQueue;

public class Sample9 implements Runnable{
	protected BlockingQueue  producer;

	public Sample9(BlockingQueue queue){
		producer=queue;
	}

	public void run(){
		try{
			producer.put("1");
			Thread.sleep(1000);

			producer.put("2");
			Thread.sleep(2000);

			producer.put("3");
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}
