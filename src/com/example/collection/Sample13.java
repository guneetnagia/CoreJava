package com.example.collection;

public class Sample13 {
	public static void main(String h[]){
		String a="abc";
		String b="abc";
		String c=new String("abc");
		String d=new String("abc").intern();

		// == compares memory location
		if(a==b){
			System.out.println("a==b");   //true
		}
		if(a==c){
			System.out.println("a==c");  //false
		}
		if(a==d){
			System.out.println("a==d");  //true
		}
		if(c==d){
			System.out.println("c==d");  //false
		}
		if(a.equals(b)){
			System.out.println("a equals b");  //true
		}
		if(a.equals(c)){
			System.out.println("a equals c");  //true
		}
		if(a.equals(d)){
			System.out.println("a equals d");  //true
		}
		if(c.equals(d)){
			System.out.println("c equals d");  //true
		}
	}
}
