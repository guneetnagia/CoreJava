/*
 * synchronized keyword
 * If one thread acquire the intrinsic lock on object, rest of the threads have to wait for thread1 to release the lock.
 */

package com.example.threading;

public class Sample5 {

	private int count=0;

	public static void main(String aaa[]){
		Sample5 sam = new Sample5();
		sam.dowork();
	}

	public void dowork(){
		Thread t1 = new Thread(new Runnable(){
			public void run(){
				for( int i = 0 ; i<10000 ; i++){
					increment();
				}
			}
		});


		Thread t2 = new Thread(new Runnable(){
			public void run(){
				for( int i = 0 ; i<10000 ; i++){
					increment();
				}
			}
		});

		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		System.out.println("count is " + count);
	}

	public synchronized void increment(){
		count++;
	}

}
