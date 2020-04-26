package guneet.java8.lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateExample {
	public static void main(String aaa[]){
		Predicate<String> p1 = Predicate.isEqual("two");
		Predicate<String> p2 = Predicate.isEqual("three");
		Consumer<String> c1 = System.out::println;
		
		//Predicate<String> p3 = s -> s.length()<4;
		List<String> result = Arrays.asList("one","two","three","four","five","six","seven");
		
		//result.stream().filter(p3).forEach(c1);
		result.stream().filter(p1.or(p2)).forEach(c1);
	}
}
