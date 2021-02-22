package guneet.threading;

public class Example1 {
	public static void main(String aaa[]) throws InterruptedException{
		Thread t1 = new Thread(()->{
			System.out.println("new thread started");
			try {
				Thread.sleep(3000);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("thread is about to die");
		});
		
		t1.start();
		t1.join();
		Thread.sleep(1000);
		System.out.println("main thread");
	}
}
