/*
 * Find four elements a, b, c and d in an array such that a+b = c+d
 * Given an array of distinct integers, find if there are two pairs (a, b) and (c, d) such that a+b = c+d, and a, b, c and d are distinct elements. If there are multiple answers, then print any of them 
 *  Input:   {3, 4, 7, 1, 2, 9, 8}
	Output:  (3, 8) and (4, 7)
	Explanation: 3+8 = 4+7
 */
package arrayCode;

import java.util.HashMap;

public class SumFour {
	class Pair{
		int first;
		int second;
		Pair(int f,int s){
			first=f;
			second=s;
		}
	}
	
	public static void main(String aaa[]){
		int arr[] = {3, 4, 7, 1, 2, 9, 8};
		SumFour s = new SumFour();
		s.findSum(arr);
	}
	
	public Boolean findSum(int arr[]){
		int size = arr.length;
		HashMap<Integer, Pair> map = new HashMap<>();
		for(int i=0;i<size;i++){
			for(int j=i+1;j<size;j++){
				int sum = arr[i] + arr[j];
				if(!map.containsKey(sum)){
					map.put(sum, new Pair(i,j));
				}
				else{
					Pair pair = map.get(sum);
					System.out.println("Pairs are : ("+ arr[pair.first] +":" + arr[pair.second]+ ") and (" +arr[i]+":"+arr[j]+")");
				}
			}
		}
		return false;
	}
	
}
