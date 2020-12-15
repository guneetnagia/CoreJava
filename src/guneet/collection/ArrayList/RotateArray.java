package guneet.collection.ArrayList;

import java.util.Arrays;

public class RotateArray {
	public static void main(String aaa[]){
		
		RotateArray ra = new RotateArray();
		int[] arr = {1,2,3,4,5,6,7,8,9};
		System.out.println("Before");
		ra.display(arr);
		ra.leftRotate(arr, 2, arr.length);
		System.out.println("After");
		ra.display(arr);
	}
	//array arr, rotate by d, size of array n
	public void leftRotate(int arr[], int d, int n){
		for(int j=0;j<d;j++){
			rotateOne(arr,n);
		}
	}
	
	public void rotateOne(int arr[], int n){
		int temp = arr[0];
		int i=0;
		for(i=0;i<n-1;i++){
			arr[i] = arr[i+1];
		}
		arr[i] = temp;
	}
	
	public void display(int arr[]){
		Arrays.stream(arr).forEach(i -> System.out.print(i));
	}
}
