package com.guneet.oops;

interface A{
	static final int a = 100;
	public void display();
}

interface B{
	static final int a = 100;
	public void display();
}

public class Poly1 implements A,B{
	public static void main(String args[]){
		
	//	System.out.println(a);   //error
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}
}

