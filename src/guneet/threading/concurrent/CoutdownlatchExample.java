package guneet.threading.concurrent;

import java.util.concurrent.CountDownLatch;

public class CoutdownlatchExample {
	public static void main(String aaa[]){
		CountDownLatch cdl = new CountDownLatch(5);
		A a = new A(cdl);
		new Thread(a).start();
		B b = new B(cdl);
		new Thread(b).start();
	}
}

class A implements Runnable{
	CountDownLatch latch = null;
	public A(CountDownLatch latch){
		this.latch = latch;
	}
	@Override
	public void run() {
		try {
			latch.await();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("running A");
	}

}

class B implements Runnable{
	CountDownLatch latch = null;
	public B(CountDownLatch latch){
		this.latch = latch;
	}
	@Override
	public void run() {
		for(int i=0;i<10;i++){
			latch.countDown();
			System.out.println("Running B");
		}
	}
}
