package online;

class ThreadtTest {
	public static void main(String aar[]){
		try{
			aMethod();
		}
		catch(Exception e){
			System.out.println("Exception");
		}
		System.out.println("finieshed");
	}
	public static void aMethod() throws Exception{
		try{
			throw new Exception();
		}
		finally{
			System.out.println("finally");
		}
	}
	
}
