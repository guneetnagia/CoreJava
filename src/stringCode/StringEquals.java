package stringCode;

public class StringEquals {
	public static void main(String aaa[]){
		String a1=null;
		String a2="";
		String a3 = new String();
		
		//Below is safe way to test empty string - no chance of null pointerException
		//Slower
		System.out.println("A1 empty test "+"".equals(a1));    //false
		System.out.println("A2 empty test " + "".equals(a2));  //true
		System.out.println("A3 empty test "+"".equals(a3));	  //true
		
		
		//Faster
		//check the length of String
		//not safe way becoz of null pointer exception
		//System.out.println("A1 length empty test " + a1.length());
		
		String a4="Test";
		String a5=new String("Test");
		System.out.println("a4==a5 check "+a4==a5);
		String a7 = a5.intern();
		System.out.println("a4==a5 check "+a4==a7);
		final String a6 = "Test".intern();
		System.out.println(" "+a4==a6);
		System.out.println(a4.equals(a5));
		System.out.println(a4.equals(a6));
	}
}
