package guneet.interview.java4s;

public class CustomExceptionMain {
	public static void main(String hh[]) throws Exception{
		int price = -120;
		if(price < 0){
			throw new CustomException(price);
		}
		else {
			System.out.println("Normal code flow");
		}
	}
}
