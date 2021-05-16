package online;

import java.util.LinkedHashMap;
import java.util.Map;

public class UniqueProduct {
    public static String firstUniqueProduct(String[] products) {
		/*
		 * return Stream.of(products)
		 * .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
		 * .entrySet() .stream() .filter(entry->entry.getValue() ==1) .findFirst()
		 * .map(Map.Entry::getKey) .orElse(null);
		 */
    	
    	 Integer ZERO = 0; // to avoid repeated autoboxing below
    	    final LinkedHashMap<String, Integer> map = new LinkedHashMap<>(products.length);

    	    // build the map
    	    for (String s : products) {
    	        Integer count = map.getOrDefault(s, ZERO);
    	        map.put(s, count + 1);
    	    }

    	    // find the first unique entry. Note that set order is deterministic here.
    	    for (Map.Entry<String, Integer> entry : map.entrySet()) {
    	        if (entry.getValue() == 1) {
    	            return entry.getKey();
    	        }
    	    }
    	    return null;
    }

    public static void main(String[] args) {
        System.out.println(firstUniqueProduct(new String[] { "Apple", "Computer", "Apple", "Bag"  }));
    }
}
