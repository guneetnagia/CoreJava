package com.searching;

import java.util.Arrays;

public class Linear {
	public static void main(String aaa[]){
		int[] arr = {1,3,5,7,9,8,6,4,2};
		int num = 9;
		for(int i=0;i<arr.length;i++){
			if(arr[i] == num){
				System.out.println("Found Element at : " + i);
				break;
			}
		}
		
		// Java - 8
		System.out.println(Arrays.stream(arr).filter(e->e==9).findFirst().getAsInt());
	}
}
