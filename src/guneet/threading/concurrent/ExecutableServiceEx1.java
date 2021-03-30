package guneet.threading.concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutableServiceEx1 {
	static class Service implements Runnable{
		@Override
		public void run(){
			System.out.println("Running ..." + Thread.currentThread());
		}
	} 
	public static void main(String aaap[]){
		ExecutorService ex = Executors.newFixedThreadPool(5);
		for(int i=0;i<10;i++){
			ex.execute(new Service());
		}
	}
}