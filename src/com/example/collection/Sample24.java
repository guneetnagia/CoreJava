package com.example.collection;

import java.util.Iterator;
import java.util.TreeSet;

public class Sample24 {
	public static void main(String aaa[]){
		TreeSet set = new TreeSet();
		set.add("Huda Tutorials");
		set.add("Java Tutorials");
		set.add("Java Tutorials");
		set.add("C Tutorials");
		set.add("CPP Tutorials");
		System.out.println("size of treeset is " + set.size());
		System.out.println("Elements are : " + set);
		Iterator itr = set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
