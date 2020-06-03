package guneet.hackerEarth;


/*
 * Write the following methods that return a lambda expression performing a specified action:

PerformOperation isOdd(): The lambda expression must return  if a number is odd or  if it is even.
PerformOperation isPrime(): The lambda expression must return  if a number is prime or  if it is composite.
PerformOperation isPalindrome(): The lambda expression must return  if a number is a palindrome or  if it is not.

 */

import java.io.*;
import java.util.*;

import java.util.stream.LongStream;

interface PerformOperation {
	boolean check(int a);
}

class MyMath {
	public static boolean checker(PerformOperation p, int num) {
		return p.check(num);
	}

	public PerformOperation isOdd(){
		return (int x) -> x%2 != 0;
	}

	public PerformOperation isPrime(){
		return (int n) -> LongStream.range(2, (long)Math.ceil(Math.sqrt(n+1))).noneMatch(x -> n%x == 0);
	}
	public PerformOperation isPalindrome(){
		return  (int a) -> {
			int number = a;
			int remainder = 0;
			int reverse = 0;
			while(number != 0){
				remainder = number % 10;
				reverse = (reverse * 10) + remainder;
				number = number / 10;
			}
			if(reverse == a){
				return true;
			}
			else{
				return false;
			}

		};
	}

}

public class LambdaExp {
	public static void main(String[] args) throws IOException {
		MyMath ob = new MyMath();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		PerformOperation op;
		boolean ret = false;
		String ans = null;
		while (T--> 0) {
			String s = br.readLine().trim();
			StringTokenizer st = new StringTokenizer(s);
			int ch = Integer.parseInt(st.nextToken());
			int num = Integer.parseInt(st.nextToken());
			if (ch == 1) {
				op = ob.isOdd();
				ret = ob.checker(op, num);
				ans = (ret) ? "ODD" : "EVEN";
			} else if (ch == 2) {
				op = ob.isPrime();
				ret = ob.checker(op, num);
				ans = (ret) ? "PRIME" : "COMPOSITE";
			} else if (ch == 3) {
				op = ob.isPalindrome();
				ret = ob.checker(op, num);
				ans = (ret) ? "PALINDROME" : "NOT PALINDROME";

			}
			System.out.println(ans);
		}
	}
}
