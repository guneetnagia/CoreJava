package com.java8.streamEx;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class Example12 {
	public static void main(String aaa[]){
		IntSummaryStatistics summ = IntStream.of(7,2,3,1,5,6).summaryStatistics();
		System.out.println(summ);
	}
}
