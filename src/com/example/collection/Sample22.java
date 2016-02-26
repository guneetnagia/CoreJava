/**
 *  Write a program to print all permutations of a given string without repetition
 *  input : A  output : A
 *  input : AB  output : AB,BA
 *  input : ABC  output : ABC,ACB,BAC,BCA,CAB,CBA
 */
package com.example.collection;

public class Sample22 {

	public static void main(String[] args) {
		permutation("ABCD");
	}

	private static void permutation(String string) {
		printPermutation(string,"");
	}

	private static void printPermutation(String string, String permutation) {

		if(string.length()==0){
			System.out.println(permutation);
			return;
		}

		for (int i = 0; i < string.length(); i++) {
			char toAppendToPermutation = string.charAt(i);
			String remaining = string.substring(0, i) + string.substring(i + 1);

			printPermutation( remaining,  permutation + toAppendToPermutation);
		}
	}
}
