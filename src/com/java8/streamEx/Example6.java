package com.java8.streamEx;

import java.util.Arrays;

public class Example6 {
	public static void main(String aaa[]){
		Arrays.stream(new int[] {2,3,6,8}).map(x -> x * x).average().ifPresent(System.out::println);
	}
}
