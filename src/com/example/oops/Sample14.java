package com.example.oops;

public class Sample14 {
	private void fun(){
		System.out.println("outer fun");
	}
	class Base extends Sample14{
		private void fun(){
			System.out.println("inner fun");
		}
	}

	public static void main(String aaa[]){
		/*Sample14.Base sam = new Sample14().new Base();
		sam.fun();*/
		Sample14 sam = new Sample14();
		sam.fun();
		Base base = sam.new Base();
		base.fun();
	}
}