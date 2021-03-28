package com.learnJava.streams_terminal;

import java.util.stream.Collectors;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class StreamsJoiningExample {
	public static void main(String[] args) {
		String output = StudentDataBase.getAllStudents()
		.stream()
		.map(Student::getName)
		.collect(Collectors.joining(", "));
		System.out.println(output);
	}
}
