package guneet.interview.java4s;

public class FirstCharCheck {
	public static void main(String aaa[]){
		String sample = "G8Guneet";
		if(sample.length() == 0){
			return;
		}
		char check = sample.charAt(0);
		Boolean test = Character.isDigit(check);
		System.out.println(test);
	}
}
