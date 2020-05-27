package guneet.java8.interfaces;

import java.util.function.Consumer;

public class ConsumerEx {
	public static void main(String aaa[]){
		Consumer<String> sysout = System.out::println;
		sysout.accept("Something something");
		sysout.accept("test test");
		
	}
}
