package guneet.interview.java4s;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class RemoveDuplicate {
	public static void main(String args[]){
		List<String> in = new ArrayList<String>();
		List<String> out;
		
		in.add("One");
		in.add("Two");
		in.add("One");
		in.add("Three");
		in.add("One");
		
		out = new ArrayList<>(new HashSet<>(in));
		System.out.println(out);
	}
}
