package guneet.threading;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Class12CallableFuture {
	public static void main(String aaa[]){
		/*ExecutorService executor = Executors.newCachedThreadPool();
		executor.submit(new Runnable() {
			
			@Override
			public void run() {
				Random random = new Random();
				int duration = random.nextInt(4000);
				System.out.println("Starting Thread " + Thread.currentThread());
				try {
					Thread.sleep(duration);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Ending Thread " + Thread.currentThread());
			}
		});
		executor.shutdown();*/
		
		ExecutorService executor = Executors.newCachedThreadPool();
		Future<Integer> future = executor.submit(new Callable<Integer>() {

			@Override
			public Integer call() throws Exception {
				System.out.println("Starting Thread " + Thread.currentThread());
				Random random = new Random();
				int duration = random.nextInt(4000);
				Thread.sleep(duration);
				System.out.println("Ending Thread " + Thread.currentThread());
				return duration;
			}
		});
		try {
			future.get();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
		executor.shutdown();
		
	}
}
