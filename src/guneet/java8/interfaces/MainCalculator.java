package guneet.java8.interfaces;

public class MainCalculator {
	public static void main(String aaa[]){
		Calculator calc = new BasicCalculator();
		System.out.println(calc.add(1, 2));
		
		BasicCalculator bc = new BasicCalculator();
		System.out.println(bc.add(1, 3));
		
		Calculator cc = CalculatorFactory.getInstance();
		System.out.println(cc.multiply(1, 4));
		
		Calculator mc = Calculator.getInstance();
		System.out.println(mc.divide(10, 2));
	}
}
