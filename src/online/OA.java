package online;

public class OA {
	public static void main(String[] args) {
		// NOTE: The following input values will be used for testing your solution.
		isOneAway("abcde", "abcd"); // should return true
		isOneAway("abde", "abcde"); // should return true
		isOneAway("a", "a"); // should return true
		isOneAway("abcdef", "abqdef"); // should return true
		isOneAway("abcdef", "abccef"); // should return true
		isOneAway("abcdef", "abcde"); // should return true
		isOneAway("aaa", "abc"); // should return false
		isOneAway("abcde", "abc"); // should return false
		isOneAway("abc", "abcde"); // should return false
		isOneAway("abc", "bcc"); // should return false
	}

	// Implement your solution below.
	public static Boolean isOneAway(String s1, String s2) {
    	System.out.print("for " +s1 + ":" + s2 + " ");
        	
    	int m = s1.length(), n = s2.length();
    	 
        // If difference between lengths is
        // more than 1, then strings can't
        // be at one distance
        if (Math.abs(m - n) > 1) {
        	System.out.println("false");
            return false;
        }
     
        int count = 0; // Count of edits
     
        int i = 0, j = 0;
        while (i < m && j < n)
        {
            // If current characters don't match
            if (s1.charAt(i) != s2.charAt(j))
            {
                if (count == 1) {
                	System.out.println(count == 1 ? "true":"false");
                    return false;
                }
     
                // If length of one string is
                // more, then only possible edit
                // is to remove a character
                if (m > n)
                    i++;
                else if (m< n)
                    j++;
                else // Iflengths of both strings
                    // is same
                {
                    i++;
                    j++;
                }
                 
                // Increment count of edits
                count++;
            }
     
            else // If current characters match
            {
                i++;
                j++;
            }
        }
     
        // If last character is extra
        // in any string
        if (i < m || j < n)
            count++;
     System.out.println(count == 1 ? "true":"false");
        return count == 1;
    }
}