/**
 * Thread pools : way of managing lots of thread at a same time
 */
package com.example.threading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Sample8 {
	public static void main(String aaa[]){
		ExecutorService executor = Executors.newFixedThreadPool(2);
		for(int i=0;i<5;i++){
			executor.submit(new Processor1(i));
		}
		executor.shutdown();
		System.out.println("All task submitted");
		try {
			executor.awaitTermination(1, TimeUnit.DAYS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class Processor1 implements Runnable{
	private int id;
	public Processor1(int id){
		this.id = id;
	}
	public void run(){
		System.out.println("starting " + id);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("completing " + id);
	}
}
