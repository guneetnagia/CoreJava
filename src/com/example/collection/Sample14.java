/**
 * Rotate Array
 */

package com.example.collection;

public class Sample14 {
	public static void main(String f[]){
		Integer[] intArray = new Integer[]{1,2,3,4,5,6,7,8,9};
		int k=3;
		Sample14.rotateArray(intArray,k);
	}
	static void rotateArray(Integer[] iArray,int k){
		int[] newIArray = new int[iArray.length];
		for(int i=0;i<k;i++){
			newIArray[i] = iArray[iArray.length-k+i];
		}
		int j=0;
		for(int i=k;i<iArray.length;i++){
			newIArray[i]=iArray[j];
			j++;
		}
		for(int i=0;i<iArray.length;i++){

			System.out.print(" " + iArray[i]);
		}
		System.out.println(" ");
		for(int i=0;i<iArray.length;i++){
			System.out.print(" "+ newIArray[i]);
		}

	}
}
