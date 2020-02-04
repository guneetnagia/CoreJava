package guneet.collection.ArrayList;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEachConsumer {
	public static void main(String aaa[]){
		List<String> names = Arrays.asList("A","b","c");
		Consumer<String> lambdaExpression = x -> System.out.println(x.toUpperCase());
		names.forEach(lambdaExpression);
	}
}
