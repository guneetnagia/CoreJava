package guneet.threading.concurrency;

public class StopTaskAfter2Min {

	public static void main(String a[]){
		StopTaskAfter2Min task1  = new StopTaskAfter2Min();
		task1.process();
		
	}
	public void process(){
		MyTask mt = new MyTask();
		Thread t1 = new Thread(mt);
		t1.start();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		mt.keepRunning = false;
	}
}

class MyTask implements Runnable{

	public volatile boolean keepRunning = true;
	@Override
	public void run() {
		while(keepRunning){
			try {
				Thread.sleep(500);
				System.out.println("Scooby doobie doo...");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
	
}