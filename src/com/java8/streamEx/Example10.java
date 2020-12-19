package com.java8.streamEx;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Example10 {
	public static void main(String aaap[]) throws IOException{
		//Stream from file and parse data
		Stream<String> rows = Files.lines(Paths.get("data.txt"));
		rows.map(x->x.split(","))
		.filter(x->x.length==3)
		.filter(x->Integer.parseInt(x[1])>12)
		.forEach(x->System.out.println(x[0]+" :: "+x[1]+" :: "+x[2]));
	}
}
