package com.example.collection;

import java.util.*;
public class Sample7 {
	public static void main(String o[]){
		String[] arg = new String[5];
		arg[0]="S";  arg[1]="A";  arg[2]="G";
		arg[3]="A";  arg[4]="R";
		Queue<String> qu = new LinkedList<String>();
		qu.addAll(Arrays.asList(arg));
		System.out.println(qu);
		//add(e) and offer(e)
		qu.add("Z");
		System.out.println(qu);
		qu.offer("Y");
		System.out.println(qu);
		//remove
		qu.remove();
		System.out.println(qu);
		qu.poll();
		System.out.println(qu);
		//examine
		qu.element();
		System.out.println(qu);
		qu.peek();
		System.out.println(qu);
	}
}
