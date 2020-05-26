package guneet.java8.misc;

import java.util.stream.IntStream;

public class JavaLoop1 {
	public static void main(String[] args) {
		int N = 5;
		IntStream.range(1, 11).forEach(i -> System.out.println(N +" x "+ i +" = "+ i*N));
	}
}
