package guneet.hackerEarth;

import java.util.Stack;

public class BalancedBrackets {
	public static void main(String args[]){
		String s = "{[({)]}";
		
		if(s.length() %2 !=0){
			System.out.println("size miss");
		}
		
		Stack<Character> stack = new Stack<>();
		for(int i=0;i<s.length();i++){
			Character c = s.charAt(i);
			if(c == '{' || c == '(' || c == '['){
				System.out.println("pushing " + c);
				stack.push(c);
			}
			else{
				if(stack.isEmpty()){
					System.out.println("No, empty");
					break;
				}
				else{
					Character popped = stack.pop();
					System.out.println("popped " + popped);
					System.out.println(popped + " " + c);
					if(popped == '{' && c != '}'){
						System.out.println("not matching at }");
						break;
					}
					else if(popped == '[' && c != ']'){
						System.out.println("not matching at ]");
						break;
					}
					else if(popped == '(' && c != ')'){
						System.out.println("not matching at )");
						break;
					}
				}
			}
		}
	}
}
