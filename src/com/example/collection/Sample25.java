package com.example.collection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

public class Sample25 {
	public static void main(String aaa[]){
		String elements[]={"Java Tutorials","C Tutorials","CPP Tutorials","Huda Tutorials","Java Tutorials"};
		TreeSet ts = new TreeSet(Arrays.asList(elements));
		Iterator itr = ts.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
}
