package interviewCogni;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable{

	public BlockingQueue<Object> queue;
	private String name; 
	
	
	@Override
	public void run() {
		try{
			while(true){
				Object data = getResource();
				queue.put(data);
				System.out.println("resource is produced, name and queue size is : " + name +"  :: " +  queue.size());
			}
		}
		catch(InterruptedException e1){
			e1.printStackTrace();
		}
	}
	Object getResource(){
		try{
			Thread.sleep(100);
		}
		catch(InterruptedException ex){
			System.out.println("Prodducer is interrupted");
		}
		return new Object(); // with tandon numbers of producers
	}
	
	public Producer(String name,BlockingQueue<Object> prodQueue){
		this.queue = prodQueue;
		this.name = name;
	}
}
