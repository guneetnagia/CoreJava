package guneet.misc;

public class StringEqual {
	enum Flavors {
		VANILLA, CHOCOLATE, STRAWBERRY
		}
	
	public static void main(String aaa[]){
		System.out.println(Flavors.CHOCOLATE.ordinal());
		String c1 = "India";
		String c2 = new String(c1);
		
		if(c1==c2){
			System.out.println("==");  // false
		}
		if(c1.equals(c2)){
			System.out.println("equal"); // true
		}
	}
}


