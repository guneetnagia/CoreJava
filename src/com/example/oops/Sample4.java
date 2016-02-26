/*
 *   Singleton class
 * - Ensure that only one instance of a class is created
 *   Provide a global point of access to the object
 *   Classic Singleton - lazy initialization
 */
package com.example.oops;

public class Sample4 {
	public static void main(String aaa[]){
		System.out.println(ClassicSingleton.getInstance());
		System.out.println(ClassicSingleton.getInstance());
		System.out.println(ClassicSingleton.getInstance());
		System.out.println(ClassicSingleton.getInstance());
		System.out.println(ClassicSingleton.getInstance());
		System.out.println(ClassicSingleton.getInstance());
	}
}


class ClassicSingleton{
	private static ClassicSingleton instance;
	private ClassicSingleton(){}
	public static ClassicSingleton getInstance(){
		if(instance==null){
			instance = new ClassicSingleton();
		}
		return instance;
	}
}

/**
 * ClassicSingleton class is not thread-safe. If two threads—we'll call them Thread 1 and Thread 2—call ClassicSingleton.getInstance() at the same time, two ClassicSingleton instances can be created if Thread 1 is preempted just after it enters the if block and control is subsequently given to Thread 2.
 *
 * if ClassicSingleton implements the java.io.Serializable interface, the class's instances can be serialized and deserialized. However, if you serialize a singleton object and subsequently deserialize that object more than once, you will have multiple singleton instances.
 *
 *
 */