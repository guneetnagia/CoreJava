package com.guneet.constructors;

class B extends A{
	public B(){
		this("1");
		System.out.println("B");
	}
	
	public B(String something){
		super(1);
		System.out.println(something);
	}
}
