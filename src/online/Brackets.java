package online;

import java.util.ArrayDeque;
import java.util.Deque;

public class Brackets {
	public static void main(String args[]) {
		System.out.println(Brackets.areBracketsCoorect("(([](){}))"));
		System.out.println(Brackets.areBracketsCoorect("([)]"));
		System.out.println(Brackets.areBracketsCoorect(""));
		
		//String - '(([](){}))' - true
		//String - '([)]''
	}
	//{([
	//stack
	static boolean areBracketsCoorect(String brackets) {
		
		Deque<Character> que = new ArrayDeque<>();
		for(int i=0;i<brackets.length();i++) {
			char c = brackets.charAt(i);
			if(c == '(' || c=='{' || c=='[') {
				que.push(c);
				continue;
			}
			char out;
			switch(c) {
			case ')':
				out = que.pop();
				if(out == '{' || out == '[') {
					return false;
				}
				break;
				
			case '}':
				out = que.pop();
				if(out == '(' || out == '[') {
					return false;
				}
				break;
				
			case ']':
				out = que.pop();
				if(out == '{' || out == '(') {
					return false;
				}
				break;
			}
		}
		return true;
	}
}