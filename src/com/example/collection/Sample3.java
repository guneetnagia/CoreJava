package com.example.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sample3 {
	public static void main(String a[]){
		String[] arrString = new String[5];
		arrString[0]="I";		arrString[1]="AB";		arrString[2]="I";
		arrString[3]="DC";		arrString[4]="CB";

		System.out.println(" ---- orignal data ----");
		List<String> listString = new ArrayList<String>();
		listString.addAll(Arrays.asList(arrString));
		System.out.print(" "+listString);
		System.out.println("");
		System.out.println("---------swipe data inside list ---------");
		String temp = listString.get(0);
		listString.set(0, listString.get(4));
		listString.set(4, temp);
		System.out.println(" " + listString);
	}
}
