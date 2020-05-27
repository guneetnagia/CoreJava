package guneet.java8.interfaces;

import java.util.ArrayList;
import java.util.function.Supplier;

public class SupplierExample2 {
	public static void main(String aaa[]){
		Supplier<ArrayList<String>> arr = ArrayList<String>::new;
		ArrayList<String> a1= arr.get();  // calling get creates new instance of arraylist
		System.out.println(a1);
	}
}
