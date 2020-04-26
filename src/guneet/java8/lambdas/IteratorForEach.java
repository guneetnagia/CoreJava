package guneet.java8.lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class IteratorForEach {
	public static void main(String aaa[]){
		List<String> list = Arrays.asList("one","two","three","four","five");
		Consumer<String> c1 = System.out::println;
		//list.forEach(l->System.out.println(l));
		List<String> result = new ArrayList<>();
		
		Consumer<String> c2 = result::add;
		list.forEach(c1.andThen(c2));
	}
}
