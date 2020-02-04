package guneet.threading;

import java.util.Scanner;

public class Class10WaitNotify {
	public static void main(String aaa[]) throws InterruptedException{
		Processors process = new Processors();
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				
					try {
						process.producer();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				try {
					process.consumer();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		t1.start();t2.start();t1.join();t2.join();
	}
}

class Processors {
	public void producer() throws InterruptedException{
		synchronized(this){
			System.out.println("Lock aquired by producer");
			wait();
			System.out.println("Locked again");
		}
	}
	
	public void consumer() throws InterruptedException{
		Scanner scan = new Scanner(System.in);
		Thread.sleep(2000);
		synchronized (this) {
			System.out.println("waiting for return key...and wait for 5 sec ");
			scan.nextLine();
			notify();
			Thread.sleep(5000);
			System.out.println("Releasing lock..");
		}
	}
}