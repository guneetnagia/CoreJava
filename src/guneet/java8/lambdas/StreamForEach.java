package guneet.java8.lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class StreamForEach {
	public static void main(String aaa[]){
		List<String> result = new ArrayList<String>();
		List<String> list = Arrays.asList("1","2","3");
		
		Consumer<String> c1 = result::add;
		Consumer<String> c2 = System.out::println;
		list.stream().forEach(c1.andThen(c2));
		System.out.println("size of result list is : "+result.size());
	}
}
