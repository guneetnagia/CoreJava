package com.example.collection;

import java.util.*;
public class Sample12 {
	public static void main(String g[]){
		// sorting with Comparable interface
		Integer[] intArray = new Integer[5];
		intArray[0]=5;   intArray[1]=6;
		intArray[2]=8;   intArray[3]=2;
		intArray[4]=1;

		List<Integer> list = new ArrayList<Integer>();
		list.addAll(Arrays.asList(intArray));
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);

		/*String[] strArray = new String[5];
		strArray[0]="S";
		strArray[1]="A";
		strArray[2]="G";
		strArray[3]="A";
		strArray[4]="R";*/
	}
}
