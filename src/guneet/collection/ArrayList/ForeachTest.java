package guneet.collection.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForeachTest {
	public static void main(String aaa[]){
		List<String> al = Arrays.asList("a","b");
		al.forEach(each -> System.out.println(each));
	}
}
