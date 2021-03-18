package interviewCogni;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test3 {

	public static void main(String args[]){
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("A");
		
		list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).forEach((k,v) -> System.out.println(k + " :: " + v));
	}
}
