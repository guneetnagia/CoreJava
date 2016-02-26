/**
 * Starting thread
 * 2. implements runnable
 */
package com.example.threading;

public class Sample2 {
	public static void main(String aaa[]){
		Runner2 runner1 = new Runner2();
		Thread t1 = new Thread(runner1);
		Thread t2 = new Thread(runner1);
		t1.start(); t2.start();
	}
}

class Runner2 implements Runnable{

	public void run() {
		for(int i=0;i<10;i++){
			try{
				Thread.sleep(100);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
			System.out.println("Hello " + i);
		}
	}

}