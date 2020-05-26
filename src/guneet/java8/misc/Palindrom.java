package guneet.java8.misc;

import java.util.stream.IntStream;

public class Palindrom {
	
	public static void main(String aaa[]){
		String temp = "aba";
		
		Boolean flag = IntStream.range(0, temp.length() / 2)
	      .noneMatch(i -> temp.charAt(i) != temp.charAt(temp.length() - i - 1));
		System.out.println(flag ? "Yes":"No");
	}
}
