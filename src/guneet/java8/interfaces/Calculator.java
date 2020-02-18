package guneet.java8.interfaces;

public interface Calculator {
	int add(int a,int b);
	int substract(int a,int b);
	int divide(int a,int b);
	int multiply(int a,int b);
	
	static Calculator getInstance(){
		return new BasicCalculator();
	}
}

class BasicCalculator implements Calculator {
	
	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public int substract(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public int divide(int a, int b) {
		// TODO Auto-generated method stub
		if(b == 0){
			throw new IllegalArgumentException("Divisor can not be zero");
		}
		return a/b;
	}

	@Override
	public int multiply(int a, int b) {
		// TODO Auto-generated method stub
		return a*b;
	}

}