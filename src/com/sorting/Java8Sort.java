package com.sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

public class Java8Sort {
	public static void main(String aaa[]) {
		Java8Sort js = new Java8Sort();
		int[] sample1 = {5,4,3,2,1};
		int[] arr = js.sortArray(sample1);
		for(int i:arr) {
			System.out.print(i+ " ");
		}
	
	}
	
	public int[] sortArray(int[] nums) {
		return IntStream.of(nums).sorted().toArray();
	}
	
	
}
