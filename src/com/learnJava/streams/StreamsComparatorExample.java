package com.learnJava.streams;

import java.util.Comparator;
import java.util.stream.Collectors;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class StreamsComparatorExample {
 
    public static void main(String[] args) {
    	
    	StudentDataBase.getAllStudents().stream()
    	.sorted(Comparator.comparing(Student::getName))
    	.collect(Collectors.toList()).forEach(System.out::println);
    	
    	StudentDataBase.getAllStudents().stream()
    	.sorted(Comparator.comparing(Student::getGpa))
    	.collect(Collectors.toList()).forEach(System.out::println);
    	
    	StudentDataBase.getAllStudents().stream()
    	.sorted(Comparator.comparing(Student::getGpa).reversed())
    	.collect(Collectors.toList()).forEach(System.out::println);
    }
}
