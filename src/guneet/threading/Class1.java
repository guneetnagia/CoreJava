package guneet.threading;

public class Class1 {
	public static void main(String aaa[]){
		Test1 test  = new Test1();
		test.start();
	}
}

class Test1 extends Thread{
	public void run(){
		for(int i=0;i<100;i++){
			System.out.println("Hello! " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}