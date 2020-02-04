package guneet.threading;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Class9ProducerConsumer {
	private static BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);

	public static void main(String aaa[]) throws InterruptedException{
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					producer();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					consumer();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		});

		t1.start();
		t2.start();
		t1.join();t2.join();

	}
	public static void producer() throws InterruptedException{
		Random rando = new Random();
		while(true){
			queue.put(rando.nextInt(100));
		}
	}
	public static void consumer() throws InterruptedException{
		Random rando = new Random();
		while(true){
			Thread.sleep(100);
			if(rando.nextInt(10) == 0){
				Integer value = queue.take();
				System.out.println("Value is : " + value + " total size : " + queue.size());
			}
		}
	}

}
