package online;

public class StringRepeatTime {
	// AAAAABBBCCCCCC
	//A5B3C5
	public static void main(String args[]) {
		/*
		 * String input = "AAAAABBBCCCCC";
		 * 
		 * int hash[] = new int[26]; for(int i = 0; i<input.length();i++) {
		 * 
		 * hash[input.charAt(i)-65]++; System.out.println(input.charAt(i)); }
		 * System.out.println(hash['B'-65]);
		 */
		
		String input = "AAAAABBBCCCCC";
		
		int counter = 1;
		String out = "";
		for(int i = 0; i<input.length();i++) {
			if(i == input.length()-1) {
				out = out + input.charAt(i)+""+counter;
			}
			else if(input.charAt(i) == input.charAt(i+1)) {
				counter++;
				
			}
			else {
				out = out + input.charAt(i)+""+counter;
				counter=1;
			}
				
		}
		System.out.println(out);
	}

} 

