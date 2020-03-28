package guneet.hackerEarth;

import java.util.Arrays;
import java.util.Scanner;

public class CountValley {

	static int countingValleys(int n, String s){
		int count = 0;
		int altitude = 0;
		char[] ch = s.toCharArray();
		for(char c : ch) {
			
			// Step up
			if(c == 'U') {
				if(altitude == -1) {
					count++;
				}
				altitude++;
			}
			// Step down
			else {
				altitude--;
			}
			System.out.println(altitude);
		}
		return count;
	}

	private static final Scanner scanner = new Scanner(System.in);
	public static void main(String aaa[]){
		System.out.println("Enter number");
		int N = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		System.out.println("Enter " + N + " size numbers");
		String s = scanner.nextLine();
		int result = countingValleys(N,s);
		System.out.println(result);
	}
}
