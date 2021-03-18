package guneet.java8.misc;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapSort {
	public static void main(String aaa[]){
		
		Map<Integer, String> map = new TreeMap<>((a,b)->a>b ? -1 : (a<b) ? 1:0);
		map.put(100, "A");
		map.put(50, "A");
		map.put(10, "A");
		map.put(800, "A");
		map.put(200, "A");
		for(Map.Entry<Integer, String> m: map.entrySet()){
			System.out.println(m.getKey() + " :: " +m.getValue());
		}
	}
}
