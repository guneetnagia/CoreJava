package online.cts;

import java.util.Arrays;

public class Test1 {
	// Q. Array list of Integers, 11,22,33,44,55
	//11 22 33 44 55 66 77
	//66 77 11 22 33 44 55
	
	public static void main(String aaa[]){
		int arr[] = {66,77,11,22,33,44,55};
		//int orig_arr[] = {11,22,33,44,55,66,77};
		int firstElem = Arrays.stream(arr).min().getAsInt();//orig_arr[0];
		int n = arr.length;
		int orig_arr[] = {11,22,33,44,55,66,77};
		binarySearch(orig_arr, 0, n, 55);
		
		
		
		int index = countRotate(arr, n,firstElem);
		if(index ==0){
			System.out.println("List is not rotated");
		}
		else{
			System.out.println("List is rotated by " + index);
		}
		
	}
	
	static int countRotate(int  arr[], int n , int firstElem){
		
		//linear search O(n)
		for(int i=0;i<n;i++){
			//firstElem  11
			
			if(firstElem == arr[i]){
				return i;
			}
		}
		return 0;
	}
	
	//,22,33,44,55
	
	// binary search O(log n)
	
	static int binarySearch(int arr[], int first,int last, int firstElem){
		int mid = (first+last)/2;
		System.out.println(mid);
		while(first<=last){
			if(firstElem == arr[mid]){
				System.out.println("found in mid" + mid);
				return mid;
			}
			if(arr[mid] < firstElem){  //44<11
				System.out.println("not found in first half" + mid);
				first = mid+1;
			}
			else{
				System.out.println("not found in last half" + mid);
				last = mid;
			}
		}
		return 0;
	}
	
}


// time O(2*n)
// space - 