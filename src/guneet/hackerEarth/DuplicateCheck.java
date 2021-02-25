package guneet.hackerEarth;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class DuplicateCheck {
	public static void main(String aaa[]){
		  List<String> list = new ArrayList<String>();
		  list.add("First");
		  list.add("Second");
		  list.add("first");
		  list.add("FiRst");
		  
		  System.out.println(list);
		  System.out.println(list.stream().distinct().collect(Collectors.toList()));
		  
		  list.stream().map(String::toLowerCase).distinct().collect(Collectors.toList()).forEach(System.out::print);
		  
		  
	}
}
