package guneet.threading;

public class Class5Sync {
	private int count=0;
	public static void main(String aaa[]){
		Class5Sync cs = new Class5Sync();
		cs.doWork();		
	}
	
	public synchronized void incrememnt(){
		count++;
	}
	
	public void doWork(){
		Thread t1 = new Thread(new Runnable(){
			public void run(){
				for(int i=0;i<10000;i++){
					incrememnt();
				}
			}
		});
		
		Thread t2 = new Thread(new Runnable(){
			public void run(){
				for(int i=0;i<10000;i++){
					incrememnt();
				}
			}
		});
		
		t1.start();t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(count);
	}
}
