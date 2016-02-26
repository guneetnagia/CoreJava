package com.example.threading;

public class Sample10 {
	private static class MyThread extends Thread {
		public MyThread(String name) {
			super(name);
		}
		@Override
		public void start() {
			System.out.println(Thread.currentThread().getName());
		}
	}
	public static void main(String[] args) {
		MyThread myThread = new MyThread("myThread");
		myThread.run();
	}
}
