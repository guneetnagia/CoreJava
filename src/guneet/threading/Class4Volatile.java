package guneet.threading;

import java.util.Scanner;

public class Class4Volatile {
	public static void main(String aaa[]){
		HitMan man = new HitMan();
		man.start();
		
		System.out.println("Press return to stop");
		Scanner scan = new Scanner(System.in);
		scan.nextLine();
		man.shutdown();
	}
}

class HitMan extends Thread{
	
	private volatile Boolean running = true;
	public void shutdown(){
		running= false;
	}
	public void run(){
		while(running){
			System.out.println("hello");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}