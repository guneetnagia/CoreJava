package com.learnJava.streams_terminal;

import java.util.stream.Collectors;

import com.learnJava.data.StudentDataBase;

public class StreamsCountingExample {
    public static void main(String[] args) {
    	System.out.println(StudentDataBase.getAllStudents()
    	.stream()
    	.filter(s->s.getGpa()>3.9)
    	.collect(Collectors.counting()));
    }
}
