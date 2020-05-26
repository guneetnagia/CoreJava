package guneet.java8.lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class FlatMapExample {
	public static void main(String aaa[]){
		List<Integer> list1 = Arrays.asList(1,2,3,4,5);
		List<Integer> list2 = Arrays.asList(6,7,8);
		List<Integer> list3 = Arrays.asList(9,10);
		List<Integer> list4 = Arrays.asList(11,12,13,14);
		
		List<List<Integer>> list = Arrays.asList(list1,list2,list3,list4);
		
		System.out.println(list);
		//Function<List<Integer>, Integer> size = l->l.size();
		//list.stream().map(size).forEach(System.out::println);
		
		Function<List<Integer>, Stream<Integer>> flatmapper = l->l.stream(); 
		list.stream().flatMap(flatmapper).forEach(System.out::println);
	}
}
