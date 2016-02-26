/**
 * simple, fast, and thread-safe singleton implementation
 */
package com.example.oops;

public class Sample7 {
	public static void main(String aaa[]){
		Sample7 sam = Sample7.INSTANCE;
	}

	private final static Sample7 INSTANCE = new Sample7();
	private Sample7(){
	}
}
