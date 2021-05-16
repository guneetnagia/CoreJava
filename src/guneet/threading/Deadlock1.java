package guneet.threading;

public class Deadlock1 {
	public static void main(String aaa[]) {
		DeadLockDemo obj = new DeadLockDemo();
		new Thread(new Runnable() {
		@Override
			public void run() {
				obj.method1();
			}
		}).start();
		
		new Thread(new Runnable() {
			@Override
				public void run() {
					obj.method2();
				}
			}).start();
		
	}
}

class DeadLockDemo{
	public void method1() {
		synchronized(String.class) {
			System.out.println("Got lock on string in method 1");
			synchronized(Integer.class) {
				System.out.println("Got lock on Integer in method 1");
			}
		}
	}
	public void method2() {
		synchronized(Integer.class) {
			System.out.println("Got lock on Integer in method 2");
			synchronized(String.class) {
				System.out.println("Got lock on String in method 1");
			}
		}
	}
}