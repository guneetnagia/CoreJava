package guneet.hackerEarth;

import java.util.Scanner;

public class JumpingCloud {

	private static final Scanner scanner = new Scanner(System.in);
	static int jumpingOnClouds(int[] c){
		int noOfJumps = 0, i = 0;
		int N = c.length;
		while(true) {
			if(i + 2 < N && c[i + 2] == 0) {
				i += 2;
			} else if(i + 1 < N) {
				i++;
			} else {
				break;
			}
			noOfJumps++;
		}
		return noOfJumps;
	}
	public static void main(String aaa[]){
		System.out.println("enter size");
		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		System.out.println("Size is" + n);
		System.out.println("Enter elements");
		int[] c = new int[n];
		String[] cItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		for(int i=0;i<n;i++){
			int item = Integer.parseInt(cItems[i]);
			c[i] = item;
		}
		int result = jumpingOnClouds(c);
		System.out.println(result);
		scanner.close();
	}
}
