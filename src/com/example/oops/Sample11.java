/**
 * Duplicate character in strings
 */
package com.example.oops;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Sample11 {
	public static void main(String aaaa[]){
		String s1 = "guneettt";
		System.out.print( " Orignal String: " + s1);
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		char[] dupsCheck= s1.toCharArray();
		for(char ch:dupsCheck){
			if(map.containsKey(ch)){
				map.put(ch, map.get(ch)+1);
			}
			else{
				map.put(ch, 1);
			}
		}
		System.out.println(" ");
		Set<Character> keySet = map.keySet();
		for(char ch:keySet){
			if(map.get(ch)>1)
			System.out.println(ch + "  " + map.get(ch));
		}
	}
}
