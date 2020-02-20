package guneet.java8.lambdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingList implements Comparator<String>{
	public static void main(String aaa[]){
		List<String> list = Arrays.asList("ab","aba","b");

		// sort by length  -- option 1
		Collections.sort(list,new SortingList());
		System.out.println(list);
		
		// option 2 by java 8
		//reverse sort
		Collections.sort(list,(s1,s2) -> s2.length()-s1.length());
		System.out.println(list);

	}

	@Override
	public int compare(String o1, String o2) {
		if (o1.length() > o2.length()) {
			return 1;
		} else if (o1.length() < o2.length()) {
			return -1;
		} else {
			return 0;
		}
	}
}