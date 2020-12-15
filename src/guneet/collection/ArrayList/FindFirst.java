package guneet.collection.ArrayList;

import java.util.stream.IntStream;

public class FindFirst {
	public static void main(String aaa[]){
		FindFirst ff = new FindFirst();
		int[] my_array = { 5, 4, 6, 1, 3, 2, 7, 8, 9 };
		System.out.println(ff.findInArray(my_array, 6, my_array.length));
	}
	
	public static int findInArray(int arr[], int X, int length){
		return IntStream.range(0, length).filter(y -> X == arr[y]).findFirst().orElse(-1);
	}
}
