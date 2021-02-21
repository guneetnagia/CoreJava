package com.learnJava.streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;


public class StreamsExample {

	public static void main(String[] args) {

		// Students names and activity in a map
		
		Map<String, List<String>> map = StudentDataBase.getAllStudents().stream()
				.peek(Student -> {
					System.out.println(Student);
				})
				.filter(element -> element.getGradeLevel()>=3 && element.getGpa()>=4)
				
				.peek(Student -> {
					System.out.println(Student);
				})
				.collect(Collectors.toMap(Student::getName, Student::getActivities));
		System.out.println(map);
	}
}
