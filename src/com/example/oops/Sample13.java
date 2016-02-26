package com.example.oops;

public class Sample13 {
	int x=13;
	public void show(){
		final int y=9;

		class inner{
			public void show1(){
				System.out.println("value of x is " + x);
				System.out.println("value of y is " + y);
			}
		}
		inner inn = new inner();
		inn.show1();
	}
	public static void main(String aaa[]){
		Sample13 out1 = new Sample13();
		out1.show();
	}
}
