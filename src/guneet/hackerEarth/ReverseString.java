package guneet.hackerEarth;

public class ReverseString {
	public static void main(String aaa[]){
		String str = "guneet";
		System.out.println(new StringBuilder(str).reverse());
		
		StringBuilder s = new StringBuilder();
		for(int i=str.length()-1;i>=0;i--){
			s.append(str.charAt(i));
		}
		System.out.println(s.toString());
	}
}
