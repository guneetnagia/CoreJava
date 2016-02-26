/**
 * Maximum number in a collection
 */
package com.example.collection;

import java.util.*;
public class Sample11 {

	public static void main(String a[]){
		Integer[] str = new Integer[5];
		str[0]=5;   str[1]=6;	str[2]=1;   str[3]=9; str[4]=6;
		List<Integer> collect = new ArrayList<Integer>();
		collect.addAll(Arrays.asList(str));
		int largest=0;
		for(Integer i : collect){
			if(i>largest){
				largest=i;
			}
		}


		System.out.println(largest);
	}
}
