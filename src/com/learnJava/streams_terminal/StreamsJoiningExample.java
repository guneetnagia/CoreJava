package com.learnJava.streams_terminal;

import java.util.stream.Collectors;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class StreamsJoiningExample {
	public static void main(String[] args) {
		System.out.println(StudentDataBase.getAllStudents()
		.stream()
		.map(Student::getName).collect(Collectors.joining("--")));
	}
}
