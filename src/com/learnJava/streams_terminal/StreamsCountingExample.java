package com.learnJava.streams_terminal;

import com.learnJava.data.StudentDataBase;

import java.util.stream.Collectors;

public class StreamsCountingExample {

  
    public static void main(String[] args) {
    	System.out.println(StudentDataBase.getAllStudents()
    	.stream()
    	.filter(element -> element.getGender().equals("male")).collect(Collectors.counting()));
    }
}
