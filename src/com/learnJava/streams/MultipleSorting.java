package com.learnJava.streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class MultipleSorting {
	public static void main(String aaa[]){
		List<Student> list = StudentDataBase.getAllStudents();
		list.stream().sorted(Comparator.comparing(Student::getGradeLevel)
				.thenComparing(Student::getName)).collect(Collectors.toList()).forEach(System.out::println);;
	}
}
