package com.learnJava.streams_terminal;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class StreamsPartitioningExample {
	public static void main(String aaap[]){
		
		Predicate<Student> gpaCheck = student -> student.getGpa()>3.8;
		
		Map<Boolean, List<Student>> map1 = 
		StudentDataBase.getAllStudents()
		.stream()
		.collect(Collectors.partitioningBy(gpaCheck));
		
		System.out.println(map1);
		

		Map<Boolean, List<Long>> map2 = 
		IntStream.range(1, 40)
		.mapToObj(Long::new)
		.collect(Collectors.partitioningBy(i->i%2==0));
		System.out.println(map2);
	}
}