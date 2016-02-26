/**
 * Creating thread cave programming
 * 1.extend Thread class
 */
package com.example.threading;

public class Sample1 {
	public static void main(String ggg[]){
		Runner runner1 = new Runner();
		runner1.start();

		Runner runner2 = new Runner();
		runner2.start();
	}
}

class Runner extends Thread{

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
