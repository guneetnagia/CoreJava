/**
 * Data caching problem
 * Resolved using volatile keyword
 */
package com.example.threading;

import java.util.Scanner;

public class Sample4 {
	public static void main(String aaa[]){
		Processor proc = new Processor();
		proc.start();
		System.out.println("Press return to stop");
		Scanner scanner = new Scanner(System.in);
		scanner.nextLine();
		proc.shutDown();
	}
}

class Processor extends Thread{
	private volatile Boolean running= true;

	public void run(){
		while(running){
			System.out.println("Hello");

			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void shutDown(){
		running = false;
	}
}
