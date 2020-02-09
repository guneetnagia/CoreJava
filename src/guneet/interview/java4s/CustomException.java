package guneet.interview.java4s;

public class CustomException extends Exception{
	
	private static final long serialVersionUID = 1L;
	private int price;
	
	public CustomException(int price){
		this.price = price;
	}

	@Override
	public String toString() {
		return "Price should not be in negative, you have entered" +price;
	}
	
}
