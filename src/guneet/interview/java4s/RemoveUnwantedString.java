package guneet.interview.java4s;

public class RemoveUnwantedString {
	public static void main(String aaa[]){
		String testString = "(123)-456789";
		
		testString = testString.replaceAll("[^a-zA-Z0-9]","");
		
		System.out.println(testString);
	}
}
