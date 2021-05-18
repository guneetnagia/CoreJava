package online;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UniqueName {
	 public static String firstUniqueName(String[] names) {
	     Map<String, Long> m =   
		 Stream.of(names)
	        		.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
	     
	     for(String s : m.keySet()) {
	    	 if(m.get(s) == 1) {
	    		return s;
	    		 
	    	 }
	     }
	     return null;
	    }

	    public static void main(String[] args) {
	        System.out.println(firstUniqueName(new String[] { "Abbi", "Adeline", "Abbi", "Adalia" }));
	    }
	}