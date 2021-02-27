package com.searching;

public class BinarySearch {
	public static void main(String aaa[]){
		int[] arr = {-22,-3,1,5,9,45,67,100};
		int start = 0;
		int end = arr.length;
		int num = -3;
		while(start<end){
			int midpoint = (start+end)/2;
			if(arr[midpoint] == num){
				System.out.println("number found at " + midpoint);
				break;
			}
			else if(num>arr[midpoint]){
				start = midpoint +1;
			}
			else{
				end = midpoint;
			}
		}
	}
}
