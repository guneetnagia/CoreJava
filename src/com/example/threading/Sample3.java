/**
 * create thread
 * 3. shorter way
 */
package com.example.threading;

public class Sample3 {
	public static void main(String aaa[]){
		Thread t1 = new Thread(new Runnable(){
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
		});
		t1.start();



		Thread t2 = new Thread(new Runnable(){
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
		});
		t2.start();
	}
}