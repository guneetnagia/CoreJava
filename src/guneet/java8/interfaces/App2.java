package guneet.java8.interfaces;

interface B{
	default void doIt(){
		System.out.println("inside B");
	}
}

interface B1 extends B{
	@Override
	default void doIt(){
		System.out.println("inside B1");
	}
}

interface B2 extends B{
	@Override
	default void doIt(){
		System.out.println("inside B2");
	}
}
public class App2 implements B,B1,B2{
	@Override
	public void doIt(){
		B2.super.doIt();
	}
	public static void main(String aaa[]){
		B b = new App2();
		b.doIt();
	}

	
}