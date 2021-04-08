package guneet.misc;

public class TestSmallestNumber {
	public static void main(String aaa[]){
		int a[] = {10,13,8,19,4,6};
		System.out.println("------------"+findThirdSmalles(a));
	}
	// 10, 13
	// temp  = 10,
	// a[0] = 13
	// a[1] = 10
	// 13, 8
	static int findThirdSmalles(int[] a){
		int temp;
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[j]<a[i]){   
					
					temp = a[i];
					a[i] = a[j]; 
					//{13,10,8,19,4,6}
					a[j] = temp; 
				}
			}
		}
		
		return a[2];
	}
}




// O(n^2)

//O(nlog n) heap sort
// insert in a queue
// third approach

// api write in DB  -- last date
// reader -- elastic search
//database -- last updated date
// map -- creation date
// Map -- inmemory

//ui - caching --> localstorage,session storiga
// 
//	wite --- >database
// read operation - collection (last updated date in DB)


// servcie
// 1. Check last updated date in DB
// 2. hashmap 

//apprach 4 -> 3. Httpsession, cookie - sessionid