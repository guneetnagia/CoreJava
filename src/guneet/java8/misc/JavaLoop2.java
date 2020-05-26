package guneet.java8.misc;

import java.util.stream.IntStream;

public class JavaLoop2 {
	public static void main(String aaa[]){
		int a=0;
		int b=2;
		int n=10;
		/*IntStream.range(0, n).forEach(i -> System.out.print(
				a+((int)(Math.pow(2,i))*b) + " ") 
				);*/
		
	/*	IntStream.range(0, n).map(i-> a+((int)(Math.pow(2,i))*b)).forEach(i -> System.out.print(
				i + " ") 
				);
		*/
		int x = 0;
		 for(int j=0,k=0;j<n && k<=n-1;j++,k++){
	            x=(int)Math.pow(2,k)*b + x;
	             System.out.print(a+x+" ");
		 }
		
	}
}

//2 6 14 30 62 126 254 510 1022 2046
//2 4 8 16 32 64 128 256 512 1024 