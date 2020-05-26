package guneet.java8.lambdas;

public class EffectiveFinal {
	
	String walk = "Walking";
	void everyone(boolean baby){
		String approach = "amble";
		//approach = "run";
		play(()-> walk);  // instance variable
		play(()-> baby ? "yes" :"no");   // method param
		play(() -> approach);  // effective final local variable
	}
	
	void play(Gorilla g){
		System.out.println(g.move());
	}
}

interface Gorilla{
	String move();
}
