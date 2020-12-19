package com.java8.streamEx;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Example8 {
	// 	Stream row from text file, sort, filter, print
	public static void main(String aaa[]) throws IOException{
		 Path pathToFile = Paths.get("names.txt");
		 //System.out.println(pathToFile.toAbsolutePath());
		 Stream<String> lines = Files.lines(pathToFile);
		 lines.sorted().filter(x->x.length()>13).forEach(System.out::println);
		 lines.close();
	}
}
