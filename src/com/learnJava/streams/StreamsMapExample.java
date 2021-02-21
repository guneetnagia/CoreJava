package com.learnJava.streams;

import java.util.stream.Collectors;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class StreamsMapExample {
	public static void main(String[] args) {
		System.out.println(StudentDataBase.getAllStudents().stream().map(Student::getName)
				.map(String::toUpperCase)
				.collect(Collectors.toSet()));
	}

}
