package guneet.collection.stacks;

import java.util.Stack;

public class BalancedBracket {
	
	public static boolean isBalancedBracket(String text){
		Stack<Character> stack = new Stack<>();
		for(int i=0;i<text.length();i++){
			char x = text.charAt(i);
			if(x == '(' || x == '{' || x == '['){
				stack.push(x);
				continue;
			}
			if(stack.isEmpty()){
				return true;
			}
			char check;
			switch(x){
				case ')':
					check = stack.pop();
					if(check =='{' || check == '[')
						return false;
					break;
				case '}':
					check = stack.pop();
					if(check == '(' || check == '[')
						return false;
					break;
				case ']':
					check = stack.pop();
					if(check == '{' || check == '(')
						return false;
					break;
				default:
					System.out.println("something new is found " + x);
					return false;
			}
		}
		return true;
	}
	
	public static void main(String aaa[]){
		String input = "([{}])";
		String input1 = "([{}{}{}{}{}])";
		String input2 = "([{}][][](){]})";
		if(isBalancedBracket(input2)){
			System.out.println("Balanced Tree");
		}
		else{
			System.out.println("Unbalanced Tree");
		}
	}
}
