package com.learnJava.streams_terminal;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;
import static java.util.stream.Collectors.*;

import java.util.Comparator;

public class IMPORTANT_StreamsGroupingByExample {
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
		
		
		Map<Integer, Integer> map4 =
				StudentDataBase.getAllStudents()
					.stream()
						.collect(groupingBy(
									Student::getGradeLevel,
									summingInt(Student::getNoteBooks)
								));
		System.out.println(map4);
		
		// Number of times each activity
		System.out.println(
				StudentDataBase.getAllStudents()
					.stream()
					.map(Student::getActivities)
					.flatMap(List::stream)
						.collect(groupingBy(
									Function.identity(),
									Collectors.counting()
								)));
		
		// Number of times names are repeated
		Map<String, Long> map6=
		StudentDataBase.getAllStudents()
			.stream()
			.map(Student::getName)
			.collect(Collectors.groupingBy(
						Function.identity(),
						Collectors.counting()
					));
		System.out.println(map6);
		
		// Top GPA student in each grade
		Map<Integer, Optional<Student>> map7=
		StudentDataBase.getAllStudents()
			.stream()
				.collect(Collectors.groupingBy(Student::getGradeLevel,
												Collectors.maxBy(Comparator.comparing(Student::getGpa))));
		
		System.out.println(map7);
	}
}