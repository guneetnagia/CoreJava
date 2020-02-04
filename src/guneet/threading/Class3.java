package guneet.threading;

public class Class3 {
	public static void main(String aaa[]){
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				for(int i=0;i<10;i++){
					System.out.println("hello "+ i);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});

		t1.start();

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				for(int i=0;i<10;i++){
					System.out.println("hello "+ i);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});

		t2.start();
	}
}
