package com.example.oops;


public class Sample2 {
	private void fun(){
		System.out.println("outer");
	}
	class Base extends Sample2{
		private void fun(){
			System.out.println("inner");
		}
	}
	public static void main(String aaa[]){
		Sample2 sam = new Sample2();
		Base base = sam.new Base();
		sam.fun();
		base.fun();
	}
}
