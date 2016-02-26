package com.example.oops;

public class Sample10 {
	static int count=0;
	public static void main(String aaa[]){

		for(int i=11;i<=99;i+=11){
			count++;
			if(i%11==0){
				System.out.println(i);
			}
		}
		System.out.println("count is " + count);
	}
}
