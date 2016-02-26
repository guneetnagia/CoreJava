/**
 * Isomorphic letters
 * egg->add (true)
 * foo->bar (false)
 */
package com.example.collection;
import java.util.*;
public class Sample17 {
	public static void main(String args[]){
		String a="egg";
		String b="add";
		Isomorphic is = new Isomorphic();
		is.isomorphicTest(a,b);
	}
}

class Isomorphic{
	boolean isomorphicTest(String str1,String str2){
		if(str1.length() != str1.length())
			return false;
		if(str1==null || str2==null)
			return false;
		if(str1.length()==0 && str2.length()==0)
			return false;

		Map<Character,Character> map = new HashMap<Character, Character>();
		for(int i=0;i<str1.length();i++){
			char a1= str1.charAt(i);
			char b1= str2.charAt(i);

			//before inserting key-value (a1-b1), just check if map has already a key with a1 and value of it is b1 or not
			checkKey(map,b1);

		}
		return true;
	}

	public void checkKey(Map<Character,Character> map, char target){
		//check against value .. for each key


	}
}
