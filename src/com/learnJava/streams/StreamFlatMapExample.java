package com.learnJava.streams;

import java.util.List;
import java.util.stream.Collectors;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class StreamFlatMapExample {
	public static void main(String[] args) {
		System.out.println(StudentDataBase.getAllStudents().stream().map(Student::getActivities).collect(Collectors.toList()));
		StudentDataBase.getAllStudents().stream().map(Student::getActivities).flatMap(List::stream)
		.distinct()
		//.count();
		.sorted()
		.forEach(System.out::println);
	}

}
	