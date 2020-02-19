package guneet.java8.interfaces;

interface A {
	default void doIt(){
		System.out.println("Interface do it");
	}
}
public class App1 implements A{
	@Override
	public void doIt(){
		System.out.println("Class do it");
	}
	
	public static void main(String aaa[]){
		
		
		A a = new App1();
		a.doIt();
		
		App1 b = new App1();
		b.doIt();
	}
}
