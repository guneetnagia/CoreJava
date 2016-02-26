package com.example.collection;

import java.util.Arrays;

public class Sample30 {

	public static void main(String aaa[]){
		int arr1[]={1,2,3,4,5};
		int arr2[]={1,2,3,4,5};
		System.out.println(arr1==arr2);
		System.out.println(arr1.equals(arr2));
		System.out.println(Arrays.equals(arr1, arr2));
	}

}
