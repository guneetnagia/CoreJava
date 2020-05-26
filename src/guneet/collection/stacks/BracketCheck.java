package guneet.collection.stacks;

import java.util.Scanner;

public class BracketCheck {
	public static void main(String awa[]){
		System.out.println("starting");
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String input = sc.next();
			
			for(int i=0;i<input.length();i++){
				System.out.println(input.charAt(i));
			}
		}
	}
}
