package guneet.threading;

import java.util.UUID;
import java.util.concurrent.BlockingQueue;

public class Class11TokenVending implements Runnable{
	private BlockingQueue<Class11Token> queue;
	
	public Class11TokenVending(BlockingQueue<Class11Token> queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		try {
			for(int i=0;i<100;i++){
				Class11Token token = new Class11Token();
				token.setUid(UUID.randomUUID());
				token.setTokenNo(i);
				token.setDescription("Token number in progress " + i);
				
				System.out.println("Token number raised " + token);
				
				queue.put(token);
				//Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
