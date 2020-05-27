package guneet.java8.interfaces;

import java.time.LocalDate;
import java.util.function.Supplier;

public class SupplierExample {
	public static void main(String aaa[]){
		LocalDate ld = LocalDate.now();
		System.out.println(ld);
		
		Supplier<LocalDate> s1 = LocalDate::now;
		System.out.println(s1.get());
		
		Supplier<LocalDate> s2 = () -> LocalDate.now();
		System.out.println(s2.get());
	}
}

/*@FunctionalInterface
interface Supplier<T>{
	public T get();
}*/