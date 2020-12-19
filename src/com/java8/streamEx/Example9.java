package com.java8.streamEx;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Example9 {
	public static void main(String aaa[]) throws IOException{
		List<String> list = Files.lines(Paths.get("names.txt")).sorted(Comparator.reverseOrder()).map(x->x+", ").collect(Collectors.toList());
		list.forEach(x->System.out.print(x));
	}
}
