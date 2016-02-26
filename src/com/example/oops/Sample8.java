package com.example.oops;

public class Sample8 {
	public static void main(String aaa[]){
		try {
			Sample8.myException(null);
		} catch (MyOwnException e) {
			// TODO Auto-generated catch block
			  System.out.println("Inside catch block: "+e.getMessage());
		}
	}

	static void myException(String str) throws MyOwnException
	{
		if(str==null){
			throw new MyOwnException("String value is null");
		}
	}
}

class MyOwnException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	private String message=null;
	public MyOwnException(){
		super();
	}
	public MyOwnException(String message){
		super(message);
		this.message=message;
	}
	public MyOwnException(Throwable cause){
		super(cause);
	}
	@Override
	public String toString() {
		return message;
	}
	public String getMessage(){
		return message;
	}
}