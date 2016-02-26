/**
 * Thread safe singleton class
 */
package com.example.oops;

public class Sample5 {
	public static void main(String ggg[]){
		ThreadSafeSingleton.getInstance();
	}
}

class ThreadSafeSingleton{
	private ThreadSafeSingleton(){

	}
	private static ThreadSafeSingleton instance;
	public static synchronized ThreadSafeSingleton getInstance(){
		if(instance==null){
				instance = new ThreadSafeSingleton();
		}
		return instance;
	}
}
