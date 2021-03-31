package guneet.hackerEarth;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx {
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		int x =0,y=0;
		try{
			x = scanner.nextInt();
			y = scanner.nextInt();
			/*if(y==0){
				throw new ArithmeticException("java.lang.ArithmeticException: / by zero");
			}*/
			System.out.println(x/y);
		}
		catch(InputMismatchException ime){
			System.out.println("java.util.InputMismatchException");
		}
		catch(ArithmeticException ae){
			System.out.println("java.lang.ArithmeticException: / by zero");
		}
		finally{
			scanner.close();
		}
	}
}
