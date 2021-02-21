package com.learnJava.streams;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.IntStream;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class StreamReduceExample {
	public static void main(String aaap[]){
		System.out.println(IntStream.range(1, 11)
		.reduce(0, (a,b)->a+b));
		
		System.out.println(Arrays.asList(1,3,5,7).stream().reduce(1,(a,b)->a*b));
		
		Optional<Student> stud = StudentDataBase.getAllStudents()
				.stream()
				.reduce((s1,s2) -> (s1.getGpa()>s2.getGpa()) ? s1:s2);
		
		if(stud.isPresent()){
			System.out.println(stud.get());
		}
	}
}
