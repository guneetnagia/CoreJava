package guneet.java8.interfaces;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class FunctionEx {
	public static void main(String aar[]){
		
		Function<String, Integer> len = String::length;
		Function<String, String> upper = String::toUpperCase;
		BiFunction<String, String, String> concat = String::concat;
		
		Consumer<Integer> print = System.out::println;
		print.accept(len.apply("Small"));
		print.accept(len.apply("Looooooooooong"));
		print.accept(len.apply(""));
		
		
		Consumer<String> printS = System.out::println;
		
		printS.accept(upper.apply("make me big"));
		
		printS.accept(concat.apply("Greek ", "God"));
	}
}
