/*
 * Check if an array can be divided into pairs whose sum is divisible by k
 * 
 *  Input: arr[] = {9, 7, 5, 3}, k = 6
	Output: True
	We can divide array into (9, 3) and (7, 5).
	Sum of both of these pairs is a multiple of 6.
	
	Input: arr[] = {92, 75, 65, 48, 45, 35}, k = 10
	Output: True
	We can divide array into (92, 48), (75, 65) and 
	(45, 35). Sum of all these pairs is a multiple of 10.
	
	Input: arr[] = {91, 74, 66, 48}, k = 10
	Output: False
 */

package arrayCode;

public class PairDivide {
	public static void main(String aaa[]){
		PairDivide p = new PairDivide();
		int numbr = 6;
		int arr[]={9, 7, 5, 3};
		p.findDivide(numbr,arr);
	}
	public Boolean findDivide(int numberm,int arr[]){
		
		return false;
	}
	
}
