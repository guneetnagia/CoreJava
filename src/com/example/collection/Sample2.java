package com.example.collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Sample2 {
	public static void main(String a[]){
		String[] arrString = new String[5];
		arrString[0]="I";
		arrString[1]="AB";
		arrString[2]="I";
		arrString[3]="DC";
		arrString[4]="CB";

		Set<String> arrSet = new HashSet<String>();
		arrSet.addAll(Arrays.asList(arrString));
		for(String pri:arrSet)
			System.out.print(pri + "  ");
		System.out.println("");
		Set<String> uniqSet = new HashSet<String>();
		Set<String> dupSet = new HashSet<String>();
		for(int i=0;i<arrString.length;i++){
			if(!uniqSet.add(arrString[i])){
				dupSet.add(arrString[i]);
			}
		}

		uniqSet.removeAll(dupSet);

		System.out.println("unique words : "+ uniqSet);
		System.out.println("Duplicate words : "+ dupSet);
	}
}
