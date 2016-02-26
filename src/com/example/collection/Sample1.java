package com.example.collection;

import java.util.*;

public class Sample1 {
	public static void main(String a[]){
		Set<String> s = new HashSet<String>();
		s.add("I");
		s.add("ABC");
		s.add("BCD");
		s.add("I");
		s.add("ABCD");
		s.add("CD");
		System.out.println("Before operations");

		System.out.println("    ----- Find Duplicate --------    ");
		for(String pri:s)
			System.out.print(pri+" ");
		System.out.println("");
		System.out.println("    ----- Sorted Set ------ ");
		Set<String> tree=new TreeSet<String>();
		tree.addAll(s);
		for(String pri:tree)
			System.out.print(pri+" ");
	}
}
