package com.learnJava.streams_terminal;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;
import static java.util.stream.Collectors.*;

public class StreamsGroupingByExample {
	public static void main(String aaa[]){
		
		// Simple
		Map<String, List<Student>> map1 = StudentDataBase.getAllStudents()
		.stream()
		.collect(groupingBy(Student::getGender));
		System.out.println(map1);
		
		
		// Custom key
		Map<String, List<Student>> map2 = 
		StudentDataBase.getAllStudents()
			.stream()
				.collect(groupingBy(s -> s.getGpa() > 3.8 ? "Outstanding" : "Average"));
		System.out.println(map2);
		
		// Two level grouping
		Map<Integer, Map<String,List<Student>>> map3 =
		StudentDataBase.getAllStudents()
			.stream()
				.collect(groupingBy(
							Student::getGradeLevel,
							groupingBy(s -> s.getGpa() > 3.8 ? "Outstanding" : "Average")
						));
		System.out.println(map3);
	}
}