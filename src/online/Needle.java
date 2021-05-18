package online;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Needle { 
	public static int count(String needle, InputStream haystack) throws Exception {
		 int count = 0;
		 Scanner sc2 = new Scanner(haystack);
		 try {
		 
		 while(sc2.hasNextLine()) {
	         String line = sc2.nextLine();
	         
	         if(line.indexOf(needle)!=-1) {
	            count = count+1;
	         }
	      }
		 }
		 finally {
			 sc2.close();
		 }
		return count;
	}

public static void main(String[] args) throws Exception {
    String inMessage = "Hello, there!\nHow are you today?\nYes, you over there.";

    try(InputStream inStream = new ByteArrayInputStream(inMessage.getBytes())) {
        System.out.println(Needle.count("there", inStream));
    }
}
}