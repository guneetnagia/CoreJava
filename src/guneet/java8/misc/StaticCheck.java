package guneet.java8.misc;

import java.util.Scanner;

public class StaticCheck {

static int B;
static int H;
static Boolean flag=false;
static{
    Scanner input = new Scanner(System.in);
    B = input.nextInt();
    H = input.nextInt();
    flag = false;
    try{
        if(B<0 || H < 0){
            throw new Exception("java.lang.Exception: Breadth and height must be positive");
        }
        else{
            flag=true;
        }
    }
    catch(Exception e){
        System.out.println(e.getMessage());
    }
}
public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class

