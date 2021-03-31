package guneet.misc;

public abstract class AbstractTest {
	int a;
	int b;
	public AbstractTest(int a, int b) {
		// TODO Auto-generated constructor stub
	}
	public AbstractTest(){
		System.out.println("cons is called");
	}
	
	public static void main(String aaa[]){
		//AbstractTest ab = new AbstractTest();
		//constructor is provided in Abstract class just for constructor chaining , and subclass can be initiated
	}
}
