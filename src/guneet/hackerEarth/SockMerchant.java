package guneet.hackerEarth;

import java.io.*;
import java.util.*;

public class SockMerchant {

    static int sockMerchant(int n, int[] ar) {
    	
        Arrays.sort(ar);
        int total = 0;
        for (int i = 0; i < n-1; i++) {
            if (i < n && ar[i] == ar[i + 1]) {
                total++;
                i = i + 1;
            }
        }
        return total;
}

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
    	System.out.println("Enter size" );
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        System.out.println("Size is " + n);
        int[] ar = new int[n];
        System.out.println("Enter array" );
        String[] arItems = scanner.nextLine().split(" ");
       // scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);

        System.out.println(result);

        scanner.close();
    }
}
