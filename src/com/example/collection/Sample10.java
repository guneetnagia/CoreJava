package com.example.collection;

import java.util.concurrent.BlockingQueue;

public class Sample10 implements Runnable{
	protected BlockingQueue queue = null;

	public Sample10(BlockingQueue q){
		queue = q;
	}

	public void run(){
		try {
			System.out.println(queue.take());
			System.out.println(queue.take());
			System.out.println(queue.take());
		}
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
