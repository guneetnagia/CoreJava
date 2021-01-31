package com.java8.streamEx;

import java.util.stream.Stream;

public class Example4 {
	public static void main(String aaa[]){
		Stream.of("Avi","Avvu","Aauddu")
		.sorted().findFirst().ifPresent(System.out::print);
	}
}
