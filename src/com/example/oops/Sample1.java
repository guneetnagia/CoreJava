/**
 * Is it possible to override private method
 * Ans : inner class can access private member of outer class..
 * Solution in Sample2
 */
package com.example.oops;

class Base{
	public void fun(){
		System.out.println("Base");
	}
}

public class Sample1 extends Base{
	public void fun(){
		System.out.println("Derived");
	}
	public static void main(String aaa[]){
		Base sam = new Sample1();
		sam.fun();
	}
}