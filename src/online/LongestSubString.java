package online;

import java.util.HashMap;
import java.util.Map;

public class LongestSubString {
	public static void main(String arr[]) {
		LongestSubString.longest("AA");
	}
	static void longest(String str) {
		System.out.println("Entering");
		int n = str.length();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		String result = "";
		
		for(int i=0,j=0; j < n;j++) {
			char current = str.charAt(j);
			if(map.containsKey(current)) {
				i = map.get(current)+1;
			}
			if(result.length() < j - i+1) {
				result = str.substring(i,j+1);
			}
			map.put(current, j);
		}
		
		System.out.println(result);
		
	} 
}
 

