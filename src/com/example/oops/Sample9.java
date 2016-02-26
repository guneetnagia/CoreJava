package com.example.oops;

public class Sample9 {
	static int number=1;
	public static void main(String aaa[]){

	}

	static void myException() throws DivideByOneMyException{
		if(number/1==1){
			throw new DivideByOneMyException();
		}
	}
}

class DivideByOneMyException extends Exception{
	private String message=null;

	public DivideByOneMyException(){
		System.out.println("Error");
	}
	public String getMessage(){
		return message;
	}


}
