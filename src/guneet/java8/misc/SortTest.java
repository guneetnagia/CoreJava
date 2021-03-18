package guneet.java8.misc;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortTest {
	public static void main(String args[]){
		List<Integer> list = Arrays.asList(10,3,5,2,4,7,1,9,2);
		
		// previous to java
		list.sort(new MyComparator());
		System.out.println(list);
		
		// with java 8
		list.sort((o1,o2) -> (o1 > o2) ? -1 : (o1<o2)? 1 : 0);
		System.out.println(list);
	}
}

class MyComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		return (o1 > o2) ? -1 : (o1<o2)? 1 : 0;
	}

	
	
}