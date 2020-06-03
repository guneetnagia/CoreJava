package guneet.java8.lambdas;

public class RunnableExample {
	public static void main(String aaa[]) throws InterruptedException{
		
		/*Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				for(int i=0;i<3;i++)
				System.out.println(i);
				try{
					Thread.sleep(1000);
				}
				catch(InterruptedException ie){
					ie.getMessage();
				}
			}
		};*/
		
		Runnable runnable = () -> {for(int i=0;i<3;i++){
			System.out.println(i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}};
		
		Thread t = new Thread(runnable);
		t.start();
		t.join();
	}
}
