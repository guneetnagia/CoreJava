package guneet.threading;

public class Example2 {
	public static void main(String aaa[]){
		MyThread m = new MyThread();
		m.start();
	}
}

class MyThread extends Thread{
	@Override
	public void run(){
		System.out.println("new thread started");
	}
}
