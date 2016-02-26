package com.example.exceptions;


class Test1{
	int x=3;
	public void add() throws NullPointerException{
		System.out.println("add1");
	}
}

class Test2 extends Test1{
	int x=4;
	public void add() throws RuntimeException{
		System.out.println("add2");
	}
}

public class Sample3 extends Test1{
}
