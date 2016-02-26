/**
 * Print all possible strings of length k that can be formed from a set of n characters
 */

package com.example.collection;

import java.util.HashSet;
import java.util.Set;

public class Sample23 {
	public static void main(String aaa[]){

		char set[] = {'a','b'};
		int k=2;
		Sample23 sam = new Sample23();
		sam.PermutationCheck(set,k);
	}

	void PermutationCheck(char[] charSet, int k){
		Set s = new HashSet();
		for(int i = 0 ; i < charSet.length ; i++){
			StringBuffer sb = new StringBuffer();
			for(int j=0;j<k;j++){
				sb.append(charSet[i]);
			}
			s.add(sb);
			System.out.println(sb);
		}


	}
}
