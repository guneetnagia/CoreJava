package hashMapCode;

import java.util.HashMap;
import java.util.Map;

public class HashMapSort {

	public static void main(String aaa[]){
		HashMap<Integer, String> unsortmap = new HashMap<>();
		unsortmap.put(3, "c");
		unsortmap.put(1, "a");
		unsortmap.put(2, "b");
		unsortmap.put(5, "e");
		unsortmap.put(4, "d");
		
		System.out.println("unsorted map, ordered map....");
		
		printMap(unsortmap);
	}
	public static void printMap(HashMap<Integer,String> map){
		for(Map.Entry<Integer, String> entry : map.entrySet()){
			
		}
	}
}
