package guneet.java8.misc;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class EvenOdd {
	public static void main(String aaa[]){
		
		IntPredicate even= o->o%2==0;
		IntStream.range(25, 48).filter(even).forEach(System.out::println);
		List<Integer> intList = Arrays.asList(2,3,4,5,6,7);
		Map<Boolean,List<Integer>> map = intList.stream().collect(Collectors.partitioningBy(i->i%2==0));
		for(Map.Entry<Boolean, List<Integer>> m : map.entrySet()){
			System.out.println(m.getKey() + "::" + m.getValue());
		}
	}
}
