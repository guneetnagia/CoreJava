package guneet.hackerEarth;

public class SmallestPositive {
	public int solution(int[] arr){
		int ptr = 0;
		 int n = arr.length;
	    // Check if 1 is present in array or not
	    for(int i = 0; i < n; i++)
	    {
	        if (arr[i] == 1)
	        {
	            ptr = 1;
	            break;
	        }
	    }
	 
	    // If 1 is not present
	    if (ptr == 0)
	        return (1);
	 
	    // Changing values to 1
	    for(int i = 0; i < n; i++){
	        if (arr[i] <= 0 || arr[i] > n)
	            arr[i] = 1;
	        //System.out.println(arr[i]);
	    }
	 
	    // Updating indices according to values
	    for(int i = 0; i < n; i++){
	        arr[(arr[i] - 1) % n] += n;
	        System.out.println(arr[i]);
	    }
	 
	    // Finding which index has value less than n
	    for(int i = 0; i < n; i++)
	        if (arr[i] <= n)
	            return (i + 1);
	 
	    // If array has values from 1 to n
	    return (n + 1);
	}
	public static void main(String aaa[]){
		SmallestPositive sp = new SmallestPositive();
		int[] a = {1,2,4};
		//int[] a = {-1,-3};
		System.out.println(sp.solution(a));
	}
}
