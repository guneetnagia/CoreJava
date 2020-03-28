package guneet.hackerEarth;

import java.util.Scanner;

class TestClass2 {
    public static void main(String args[] ) throws Exception {
        
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int [] myArray = new int[N];
        for(int i=0; i<N; i++ ) {
            myArray[i] = s.nextInt();
         }
        System.out.println(findMinNumber(myArray, N)+1); 

    }
    
    static int findMinNumber(int arr[], int n) 
    { 
        // total sum of elements 
        // of original array 
        int sum = 0; 
        for (int i = 0; i < n; i++) 
            sum += arr[i];
        sum += 1;
        System.out.println(sum);
        
        return (int) Math.floor(sum/n);
    } 
}
