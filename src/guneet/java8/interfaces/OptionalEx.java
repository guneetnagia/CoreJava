package guneet.java8.interfaces;

import java.util.Optional;

public class OptionalEx {
	
	public static void main(String aaa[]){
		Optional<Double> dob = OptionalEx.getAverage(10,20,30,40,50);
		/*if(dob.isPresent()){
			System.out.println(dob.get());
		}
		System.out.println(OptionalEx.getAverage());*/
		
		dob.ifPresent(System.out::println);
		Optional<Double> aob = OptionalEx.getAverage();
		aob.ifPresent(System.out::println);
		System.out.println(aob.orElse(Double.NaN));
		System.out.println(aob.orElseGet(Math::random));
		System.out.println(aob.orElseThrow(()->new IllegalStateException()));
		
	}

	public static Optional<Double> getAverage(int... scores){
		if(scores.length == 0)
			return Optional.empty();
		int sum = 0;
	for(int score:scores)
			sum += score;
		
		return Optional.of((double)sum/scores.length);
	}
}