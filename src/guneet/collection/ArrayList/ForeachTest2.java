package guneet.collection.ArrayList;

import java.util.Arrays;
import java.util.List;

public class ForeachTest2 {
	public static void main(String aaa[]){
		TempClass tc = new TempClass();
		List<String> list = Arrays.asList("a","b","c");
		list.forEach(each -> System.out.println(tc.convertoCaps(each)));
	}
}

class TempClass{
	public String convertoCaps(String alpha){
		return alpha.toUpperCase();
	}
}
