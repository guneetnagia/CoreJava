package guneet.collection.ArrayList;

import java.util.Arrays;
import java.util.List;

public class ForeachTest3 {
	public static void main(String aaa[]){
		List<String> list = Arrays.asList("a","b","c");
		list.forEach(each -> returnCap(each));
		
	}
	public static void returnCap(String each){
		System.out.println(each.toUpperCase());
	}
}
