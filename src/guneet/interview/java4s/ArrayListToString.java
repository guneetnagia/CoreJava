package guneet.interview.java4s;

import java.util.ArrayList;
import java.util.List;

public class ArrayListToString {
	public static void main(String aaa[]){
		// ArrayList to String array
		List<String> al = new ArrayList<String>();
		al.add("one");
		al.add("two");

		System.out.println(al);

		String[] sa = new String[al.size()];
		al.toArray(sa);
		for(String s:sa)
		{
			System.out.println(s);
		}
	}
}
