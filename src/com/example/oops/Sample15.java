package com.example.oops;


class Test1{
	public void show(){
		System.out.println("A");
	}
	public void add(){
		System.out.println("ADD");
	}
}

class Test2 extends Test1{
	public void show(){
		System.out.println("B");
	}
}

public class Sample15 extends Test2{
	public static void main(String aaa[]){
		Sample15 s = (Sample15) new Test2();
	}
}
