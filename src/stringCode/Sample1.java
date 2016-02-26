package stringCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Sample1 {
	public static void main(String aaa[]){
		String test="Javavava";
		char[] phase1 = test.toCharArray();
		printRepeated(phase1);
	}
	static void printRepeated(char[] a){
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		for(Character c: a){
			if(map.containsKey(c)){
				int value = map.get(c);
				map.put(c, value+1);
			}
			else{
				map.put(c, 1);
			}
		}
		Set<Map.Entry<Character, Integer>> entrySet = map.entrySet();
		System.out.println("Repeasted values are");
		for(Map.Entry<Character,Integer> entry:entrySet){
			if(entry.getValue()>1){
				System.out.println(entry.getKey()+"  " + entry.getValue());
			}
		}
	}
}
