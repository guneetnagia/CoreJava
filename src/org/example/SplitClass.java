package org.example;

public class SplitClass {
	public static void main (String args[]){
		String a = "1441|WHITE";String a1 = "";String a2 = "|";String a3 = "1441";
		String a4 = "1441|";String a5 = "|WHITE";String a6 = "WHITE";
		String[] arr = splitString(a2);
		if(arr.length>1){
			System.out.println(arr[0]);
			//System.out.println(arr[1]);
		}
		else{
			System.out.println("else"+arr[0]);
		}
	}
	public static String[] splitString(String totalPart){
		String[] arr = totalPart.split("\\|");
		return arr;
	}
}
