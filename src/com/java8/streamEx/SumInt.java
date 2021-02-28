package com.java8.streamEx;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class SumInt {
	public static void main(String aaap[]){
		List<Integer> list = Arrays.asList(2,4,6,8);
		System.out.println(list.stream().reduce(Integer::sum).get());
		System.out.println(list.stream().reduce(0,(x,y)->x+y));
		System.out.println(IntStream.range(0, 6).sum());
	}
}
