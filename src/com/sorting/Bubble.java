package com.sorting;

public class Bubble {
	public static void main(String aaa[]){
		int arr[] = {9,6,3,1,2,4,-3,-33,0,1};
		int n = arr.length;
		for(int i=0;i<n;i++){
			for(int j=0;j<n-i-1;j++){
				if(arr[j]>arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		for(int i=0;i<n;i++){
			System.out.println(arr[i]);
		}
	}
}
