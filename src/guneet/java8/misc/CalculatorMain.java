package guneet.java8.misc;

public class CalculatorMain {
	public static void main(String aaa[]){
		Calculator c =(a,b)-> {
			System.out.println(a+b);
		};
		c.add(3, 4);
	}
}
