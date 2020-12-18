package com.java8.streamEx;

import java.util.stream.IntStream;

public class Example1 {
	public static void main(String aaa[]){
		IntStream.range(1, 10).forEach(System.out::print);
	}
}
