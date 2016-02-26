/**
 * ListIterator, sort - natural order
 * */
package com.example.collection;

import java.util.*;

public class Sample4 {
	public static void main(String a[]){
		String[] arrString = new String[5];
		arrString[0]="S";
		arrString[1]="A";
		arrString[2]="G";
		arrString[3]="A";
		arrString[4]="R";

		List<String> setString = new ArrayList<String>();
		setString.addAll(Arrays.asList(arrString));

		Iterator<String> it = setString.iterator();
		while(it.hasNext()){
			System.out.print(it.next() +  "  ");
		}
		System.out.println("");
		ListIterator<String> iter = setString.listIterator();
		while(iter.hasNext()){
			System.out.print(iter.next()+ "  ");
		}
		System.out.println("");
		while(iter.hasPrevious()){
			System.out.print(iter.previous()+"  ");
		}
	}
}
