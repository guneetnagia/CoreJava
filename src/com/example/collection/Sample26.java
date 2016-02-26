package com.example.collection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

public class Sample26 {
	public static void main(String aaa[]){
		String elements[]={"Java Tutorials","C Tutorials","CPP Tutorials","Huda Tutorials","Java Tutorials"};
		TreeSet ts = new TreeSet(Arrays.asList(elements));
		ts.add(" NetBeans Tutorial");
		System.out.println("Size : " + ts.size());
		System.out.println("Is Empty? " + ts.isEmpty());
		System.out.println(" Huda Tutorials Contains   " + ts.contains("Huda Tutorials"));
		System.out.println("First Element " + ts.first());
		System.out.println("Last Element " + ts.last());
		System.out.println("Before removal");
		Iterator itr = ts.iterator();
		while(itr.hasNext()){
			System.out.print(itr.next() + " ");
		}

		System.out.println(" ");
		System.out.println("After Removing");
		ts.remove("C Tutorials");
		Iterator iter = ts.iterator();
		while(iter.hasNext()){
			System.out.print(iter.next());
		}
	}
}
