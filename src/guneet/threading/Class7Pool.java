package guneet.threading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Class7Pool {
	public static void main(String aaa[]){
		ExecutorService executor = Executors.newFixedThreadPool(2);
		for(int i=0;i<5;i++){
			executor.submit(new Worker(i));
		}
		executor.shutdown();
		System.out.println("All Tasks submitted");
		try {
			executor.awaitTermination(1, TimeUnit.HOURS);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("All Task completed");
	}
}

class Worker implements Runnable {
	private int id;
	public Worker(int id){
		this.id = id;
	}
	public void run() {
		System.out.println("starting " + id);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("completing " + id);
	}
}