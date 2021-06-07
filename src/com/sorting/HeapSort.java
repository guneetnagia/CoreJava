package com.sorting;

public class HeapSort {
	public static void main(String args[]) {
		int[] arr = {12,11,13,5,6,7};
		int n = arr.length;
		HeapSort heap = new HeapSort();
		heap.sort(arr,n);
		System.out.println("Sorted array is : ");
		printArray(arr);
	}
	
	public void sort(int arr[], int n) {
		// build heap (rearrange array)
		// start from n/2-1 because last element is n-1 and its parent will be n/2-1
		for(int i = n/2-1; i >= 0;i--) {
			heapify(arr, n, i);
		}
		// one by one extract element from heap
		for(int i=n-1;i>=0;i--) {
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;
			// call heapify on reduced heap
			heapify(arr,i,0);
		}
	}
	
	public void heapify(int[] arr, int n, int i) {
		int largest = i;
		int l = 2*i+1; //left
		int r = 2*i+2; //right
		// if left child is larger than root
		if(l<n && arr[l]>arr[largest]) {
			largest = l;
		}
		// if right is largest so far
		if(r<n && arr[r]>arr[largest]) {
			largest = r;
		}
		//if root is not the largest
		if(largest !=i) {
			int swap = arr[i];
			arr[i] = arr[largest];
			arr[largest] = swap;
			
			// recursively heapify the affected sub tree
			heapify(arr,n,largest);
		}
	}
	
	static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
}
