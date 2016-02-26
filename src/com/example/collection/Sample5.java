package com.example.collection;

import java.util.*;
public class Sample5 {
	public static void main(String a[]){
		String[] stringArray = new String[5];
		stringArray[0]="S";	stringArray[1]="A";	stringArray[2]="G";	stringArray[3]="A";	stringArray[4]="R";
		List<String> listArray = new ArrayList<String>();
		listArray.addAll(Arrays.asList(stringArray));

		List<String> subArray = new ArrayList<String>();
		subArray = listArray.subList(0, 2);
		System.out.println(subArray);
		listArray.subList(0, 2).clear();
		System.out.println(listArray);

	}
}
