package com.learnJava.streams_terminal;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class StreamsGroupingByExample {
	public static void main(String aaa[]){
		Map<String, List<Student>> map = StudentDataBase.getAllStudents()
				.stream()
				.collect(Collectors.groupingBy(Student::getGender));

		map.forEach((k,v)->{
			System.out.println(k+"--"+v);
		});

		System.out.println(StudentDataBase.getAllStudents()
		.stream()
		.collect(Collectors.groupingBy(Student::getGradeLevel, Collectors.groupingBy(Student::getGender))));
	}
}