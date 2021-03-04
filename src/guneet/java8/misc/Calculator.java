package guneet.java8.misc;

@FunctionalInterface
public interface Calculator {
	public abstract void add(int a,int b);
	public default void display(){
		System.out.println("calculator in progress");
	}
}
