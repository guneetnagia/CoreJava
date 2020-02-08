package guneet.threading;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;

public class Class11TokenProcess implements Runnable{
	private BlockingQueue<Class11Token> queue;
	private CountDownLatch latch;

	public Class11TokenProcess(BlockingQueue<Class11Token> queue, CountDownLatch latch) {
		this.queue =  queue;
		this.latch = latch;
	}
	@Override
	public void run() {
		while(true){
			if(0 == latch.getCount()){
				break;
			}
			try {
				Thread.sleep(50000);
				Class11Token token = queue.take();
				System.out.println("Serving Token "  + token );
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			latch.countDown();
		}
	}

}
