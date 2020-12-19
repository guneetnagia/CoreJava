package com.java8.streamEx;

import java.util.Arrays;

public class Example7 {
	public static void main(String aaa[]){
		//Stream from list, filter and print
		Arrays.stream(new String[] {"Mario Speedwagon",
				"Petey Cruiser",				"Anna Sthesia",				"Paul Molive",				"Anna Mull",
				"Gail Forcewind",				"Paige Turner",				"Bob Frapples",				"Walter Melon",
				"Nick R. Bocker",				"Barb Ackue",				"Buck Kinnear",				"Greta Life",
				"Ira Membrit",				"Shonda Leer",				"Brock Lee",				"Maya Didas",
				"Rick O'Shea",				"Pete Sariya",				"Monty Carlo",				"Sal Monella",
				"Barry Cade",				"Phil Anthropist ",				"Marvin Gardens",				"Phil Harmonic ",
				"Arty Ficial",				"Will Power",				"Donatella Nobatti",				"Juan Annatoo",
				"Stew Gots",				"Anna Rexia",				"Bill Emia",				"Curt N. Call",
				"Max Emum",				"Minnie Mum"})
		.map(x -> x.toLowerCase()).filter(x->x.startsWith("s")).map(x->x+", ").forEach(x -> System.out.print(x));
	}
}
