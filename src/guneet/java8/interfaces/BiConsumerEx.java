package guneet.java8.interfaces;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class BiConsumerEx {
	public static void main(String aa[]){
		Map<String, String> map = new HashMap<>();
		BiConsumer<String, String> biMap = map::put;
		
		biMap.accept("James", "Bond");
		biMap.accept("Albert", "Einstien");
		biMap.accept("Elon", "Musk");
		
		Consumer<String> syso = System.out::println;
		
		syso.accept(map.get("James"));
		
		
		Consumer<Collection<String>> colSys= System.out::println;
		colSys.accept(map.values());
		

		//Consumer<Set<String>> setSys = System.out::println;
		colSys.accept(map.keySet());
	}
}
