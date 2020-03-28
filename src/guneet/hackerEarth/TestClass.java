package guneet.hackerEarth;

import java.util.Scanner;

class TestClass {
    public static void main(String args[] ) throws Exception {
    	long number1 = 0;
    	long number2 = 0;
        Scanner console = new Scanner (System.in);
	if(console.hasNextLong()){
		number1 = console.nextLong();
	}
	if(console.hasNextLong()){
		number2 = console.nextLong();
	}    
          // Writing output to STDOUT
        System.out.println(commonDivisor(number1,number2));
       

    }
    
    static long gcd(long a,long b){
    	if(a == 0) {
    		return b;
    	}
    	return gcd(b%a,a);
    }

    static int commonDivisor(long num1, long num2){
    	int result =0;
    	
    	//find gcd of num1, num2
    	long n = gcd(num1,num2);
        
        	for(int i=1;i<Math.sqrt(n);i++){
        		if (n%i==0) 
                { 
                    // check if divisors are equal 
                    if (n/i == i) 
                        result += 1; 
                    else
                        result += 2; 
                } 
        	}
        
        return result;
    }
}
