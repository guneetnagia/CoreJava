package guneet.threading;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class HackerPolice {
	public static final int MAX_PASSWORD = 9999;
	public static void main(String aaa[]) {
		Random random = new Random();
		Vault vault = new Vault(random.nextInt(MAX_PASSWORD));
		List<Thread> threads = new ArrayList<Thread>();
			threads.add(new Hacker1(vault));
			threads.add(new Hacker1(vault));
			threads.add(new PoliceThread());
			
			for(Thread t:threads) {
				t.start();
			}
	}



	private static class Vault{
		private int password;
		public Vault(int pasword){
			this.password = password;
		}
		public Boolean isPasswordCorrect(int guess) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return this.password == guess;
		}
	}

	private static abstract class HackerThread extends Thread{
		protected Vault vault;
		public HackerThread(Vault vault) {
			this.vault = vault;
			this.setName(this.getClass().getSimpleName());
			this.setPriority(MAX_PRIORITY);
		}
		@Override
		public void start() {
			System.out.println("starting thread " + this.getName());
			super.start();
		}
	}

	private static class Hacker1 extends HackerThread{

		public Hacker1(Vault vault) {
			super(vault);
		}
		public void run() {
			for(int guess = 0;guess<MAX_PASSWORD;guess++) {
				if(vault.isPasswordCorrect(guess)) {
					System.out.println(this.getName() + " guessed the password " + guess);
					System.exit(0);
				}
			}
		}
		
	}
	
	private static class Hacker2 extends HackerThread{

		public Hacker2(Vault vault) {
			super(vault);
		}
		public void run() {
			for(int guess = MAX_PASSWORD;guess>0;guess--) {
				if(vault.isPasswordCorrect(guess)) {
					System.out.println(this.getName() + " guessed the password " + guess);
					System.exit(0);
				}
			}
		}
		
	}
	
	
	private static class PoliceThread extends Thread{
		@Override
		public void run() {
			for(int i=10;i>0;i--) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(i);
			}
			System.out.println("You are arrested");
			System.exit(0);
			
		}
	}

}
