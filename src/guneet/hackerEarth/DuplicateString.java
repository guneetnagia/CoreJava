package guneet.hackerEarth;

import java.util.Arrays;
import java.util.stream.Collectors;

public class DuplicateString {
	public static void main(String aaa[]){
		String s = "First,Second,first";
		String[] str = s.split(",");
		Arrays.stream(str).map(String::toLowerCase).collect(Collectors.toSet()).forEach(System.out::println);
	}
}