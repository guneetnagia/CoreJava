package guneet.hackerEarth;
//https://www.geeksforgeeks.org/reduce-the-string-by-removing-k-consecutive-identical-characters/
import java.util.Stack;

public class StringReduceByRemoval {
	public static void main(String aaa[]) {
		String sample = "efdddff";
		int k=3;
		System.out.println(StringReduceByRemoval.reduce_string(sample,k));
	}

	private static String reduce_string(String input, int k) {
		if(k==1) {
			return "";
		}

		Stack<StringReduceByRemoval.Pair> stack =  new Stack();
		int counter = 0;
		int n = input.length();

		for(int i=0;i<n;i++) {
			char current = input.charAt(i);
			if(stack.size()==0) {
				stack.push(new Pair(current, 1));
				continue;
			}

			if(stack.peek().c == current) {
				Pair p = stack.peek();
				stack.pop();
				p.counter = p.counter+1;
				if(p.counter == k) {
					continue;
				}
				else {
					stack.push(p);
				}
			}
			else {
				stack.push(new Pair(current, 1));
			}
		}

		String ans = "";
		while(stack.size()>0) {
			char c = stack.peek().c;
			int ctr= stack.peek().counter;
			while(ctr-->0) {
				ans = c+ans;
			}
			stack.pop();
		}
		return ans;
	}

	private static class Pair{
		char c;
		int counter;
		public Pair(char c, int counter){
			this.c = c;
			this.counter = counter;
		}
	}
}
