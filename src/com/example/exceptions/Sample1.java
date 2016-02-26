/**
 * checked exception :  compile time exception, compiler will not allow us to compile the code
 * So we have to either throws or try-catch the exception
 */

package com.example.exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Sample1 {

	    public static void main(String[] args) throws IOException{
	        FileReader file = new FileReader("C:\\test\\a.txt");
	        BufferedReader fileInput = new BufferedReader(file);

	        // Print first 3 lines of file "C:\test\a.txt"
	        for (int counter = 0; counter < 3; counter++)
	            System.out.println(fileInput.readLine());

	        fileInput.close();
	    }

}
