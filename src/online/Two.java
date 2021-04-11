package online;

public class Two {
	public static void main(String args[]){
		try{
			badMethod();
			System.out.println("A");
		}
		catch(RuntimeException re){
			System.out.println("B");
		}
		catch(Exception ex1){
			System.out.println("C");
		}
		finally{
			System.out.println("D");
		}
		System.out.println("E");
	}
	public static void badMethod(){
		throw new RuntimeException();
	}
}
