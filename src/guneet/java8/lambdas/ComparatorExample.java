package guneet.java8.lambdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {
	public static void main(String aa[]){
		
		/*Comparator<String> comp = new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return Integer.compare(o1.length(), o2.length());
			}
		};*/
		
		Comparator<String> comp = (x,y) -> Integer.compare(x.length(), y.length());
		
		
		List<String> list = Arrays.asList("@********","@","@***","**@","@#####");
		Collections.sort(list,comp);
		for(String l : list){
			System.out.println(l);
		}
		
	}
}
