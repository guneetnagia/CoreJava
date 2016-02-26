/**
 * insertion sort
 * 7 5 4 9 8 3 2 1
 */

package com.example.collection;

import java.util.*;

public class Sample16 {
	public static void main(String a[]){
		List<Integer> list = new LinkedList<Integer>();
		list.add(7);
		list.add(5);
		list.add(4);
		list.add(9);
		list.add(8);
		list.add(2);
		list.add(1);

		Sample16.insertionSort(list);
	}

	public static void insertionSort(List<Integer> list){
		for(int i:list)
			System.out.print(i + " ");

		for(int i:list){

		}
	}


}
