package com.example.collection;

import java.util.Arrays;
import java.util.TreeSet;

public class Sample27 {
	public static void main(String aaa[]){
		String elements[] = {"Huda Tutorials","Java Tutorials","C Tutorials"};
		String elements2[] = {"Huda Tutorials","Java Tutorials","Android Tutorials"};

		TreeSet ts1 = new TreeSet(Arrays.asList(elements));
		TreeSet ts2 = new TreeSet(Arrays.asList(elements2));

		System.out.println("Equals test " + ts2.equals(ts1));
		System.out.println("Contains all " + ts2.containsAll(ts2));

	}
}
