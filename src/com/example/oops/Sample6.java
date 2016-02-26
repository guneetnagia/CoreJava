/**
 * Double checking locking
 */
package com.example.oops;

public class Sample6 {

}

class DoubleCheckSingleton{
	private static DoubleCheckSingleton instance;
	private DoubleCheckSingleton(){

	}
	public static DoubleCheckSingleton getInstance(){
		if(instance == null){
			synchronized(DoubleCheckSingleton.class){
				if(instance==null){
					instance = new DoubleCheckSingleton();
				}
			}
		}
		return instance;
	}
}
