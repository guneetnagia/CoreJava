package guneet.java8.interfaces;

public class CalculatorFactory {
	public static Calculator getInstance(){
		return new BasicCalculator();
	}
}
