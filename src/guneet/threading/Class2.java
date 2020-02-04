package guneet.threading;

public class Class2 {
	public static void main(String aaa[]){
		Thread t1 = new Thread(new Test2());
		t1.start();	
	}

}

class Test2 implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<100;i++){
			System.out.println("hello "+ i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}