package online;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DupsCount {
	public static void main(String aaa[]){
		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(3);
		numbers.add(4);
		numbers.add(4);
		System.out.println(DupsCount.countDuplicate(numbers));
	}
	public static int countDuplicate(List<Integer> numbers){
		
		
		int count = 0;
		
		Map<Integer, Integer> resultMap = new HashMap<>();
	    for (Integer element : numbers) {
	        if (resultMap.containsKey(element)) {
	            resultMap.put(element, resultMap.get(element) + 1);
	        } else {
	            resultMap.put(element, 1);
	        }
	    }
	    for (Map.Entry<Integer,Integer> entry : resultMap.entrySet()){
	    	
	    	if(entry.getValue() > 1){
	    		count++;
	    	};
	    }
	    
		return count;
	}
}
