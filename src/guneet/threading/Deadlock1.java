package guneet.threading;

public class Deadlock1 {
	public static void main(String aaa[]) {
		DeadLockDemo obj = new DeadLockDemo();
		new Thread(() ->obj.method1()).start();
		
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
			System.out.println("String - method 1 "+ Thread.currentThread().getName());
			synchronized(Integer.class) {
				System.out.println("Integer - method 1 "+ Thread.currentThread().getName());
			}
		}
	}
	public void method2() {
		synchronized(Integer.class) {
			System.out.println("Integer - method 2 "+ Thread.currentThread().getName());
			synchronized(String.class) {
				System.out.println("String - method 2 "+ Thread.currentThread().getName());
			}
		}
	}
}