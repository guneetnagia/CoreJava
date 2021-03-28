package com.learnJava.streams_terminal;

import java.util.Comparator;
import java.util.stream.Collectors;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class StreamsMinByMaxByExample {
	public static void main(String aaa[]){
		System.out.println(
		StudentDataBase.getAllStudents()
		.stream()
		.filter(s->s.getGradeLevel()==2)
		.collect(Collectors.maxBy(Comparator.comparing(Student::getGpa))).get());
		
		System.out.println(
		StudentDataBase.getAllStudents()
		.stream()
		.collect(Collectors.minBy(Comparator.comparing(Student::getGpa))).get());
		
	}
}
