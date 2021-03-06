package online;

public class MissingNumber {
	
	public static void main(String aaa[]){
		//int arr[] = {3,0,1};
		//int arr[] = {9,6,4,2,3,5,7,0,1};
		int arr[] = {0,1};
		System.out.println(missingNumber(arr,arr.length));
	}
	
	static int missingNumber(int a[], int n){
		int i,total;
		//sum of all
		total = (n*(n+1))/2;
		// System.out.println(total);
		// subtract sum of the numbers in the array
		// Worst case :: O(n)
		for(i=0;i<n;i++){
			total -= a[i];
		}
		return total;
	}
	
	
	
}