package com.java8.streamEx;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example11 {
	public static void main(String aaa[]) throws IOException{
		Stream<String> rows = Files.lines(Paths.get("data.txt"));
		
		Map<String, Integer> map = new HashMap<>();
		map = rows
				.map(x->x.split(","))
				.filter(x->x.length>1)
				.collect(Collectors.toMap(
						x->x[0], 
						x->Integer.parseInt(x[1])));
		rows.close();
		for(String key:map.keySet()){
			System.out.println(map.get(key));
		}
	}
}
