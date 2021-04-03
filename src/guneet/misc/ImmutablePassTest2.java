package guneet.misc;

import java.util.HashMap;
import java.util.Map;

public final class ImmutablePassTest2 {
	private final int a;
	private final HashMap<String, Integer> hash;
	
	public  ImmutablePassTest2(int a, HashMap<String, Integer> map){
		this.a = a;
		HashMap<String, Integer> cloneMap  = new HashMap<>();
		for(Map.Entry<String, Integer> m : map.entrySet()){
			cloneMap.put(m.getKey(), m.getValue());
		}
		this.hash = cloneMap;
	}
	
	public int getA() {
		return a;
	}
	public HashMap<String, Integer> getHash() {
		return hash;
	}
	
	
	public static void main(String aaap[]){
		HashMap<String, Integer> map1 = new HashMap<>();
		map1.put("A", 1);
		map1.put("B", 2);
		
		ImmutablePassTest2 mit = new ImmutablePassTest2(10, map1);
		System.out.println(mit.getHash().size());
		map1.put("C", 3);
		System.out.println(mit.getHash().size());
	}
}
