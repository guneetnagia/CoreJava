package com.learnJava.streams_terminal;

import java.util.Comparator;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;
import static java.util.stream.Collectors.minBy;
import static java.util.stream.Collectors.maxBy;

public class StreamsMinByMaxByExample {
	public static void main(String aaa[]){
		System.out.println(StudentDataBase.getAllStudents()
		.stream()
		.collect(minBy(Comparator.comparing(Student::getGpa))).get());
		
		System.out.println(StudentDataBase.getAllStudents()
				.stream()
				.collect(maxBy(Comparator.comparing(Student::getGpa))).get());
	}
}
