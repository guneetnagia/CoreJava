package guneet.java8.misc;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Test11 {
	public static void main(String args[]){
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "A");
		map.put(2, "B");
		
		System.out.println(map.entrySet().stream().filter(e->e.getValue() != "B").collect(Collectors.toList()));
	}
}