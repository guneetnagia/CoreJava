package guneet.java8.interfaces;

import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateEx {

	public static void main(String aaa[]){
		Predicate<String> egg = s -> s.contains("egg");
		Predicate<String> white = s -> s.contains("white");
		
		Predicate<String> eggwhite = egg.and(white);
		Predicate<String> eggBlack = egg.or(white);
		Predicate<String> eggOther = egg.and(white.negate());
		String testing = "A whole egg omlette";
		
		Consumer<String> sys = System.out::println;
		
		sys.accept(eggwhite.test(testing) + "");
		sys.accept(eggBlack.test(testing) + "");
		sys.accept(eggOther.test(testing) + "");
		
		
		BiPredicate<String, String> start = String::startsWith;
		sys.accept(start.test("A quick fox", "A quu" ) + "");
	}
}
