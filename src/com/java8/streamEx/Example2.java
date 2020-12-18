package com.java8.streamEx;

import java.util.stream.IntStream;

public class Example2 {
	public static void main(String aaa[]){
		IntStream.range(1, 10).skip(5).forEach(System.out::print);
	}
}
