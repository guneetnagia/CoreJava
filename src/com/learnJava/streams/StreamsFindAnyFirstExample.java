package com.learnJava.streams;

import com.learnJava.data.StudentDataBase;

public class StreamsFindAnyFirstExample {

	public static void main(String[] args) {
		System.out.println(StudentDataBase.getAllStudents().parallelStream().filter(element -> element.getGpa() >=3.9).findAny());
    	
		System.out.println(StudentDataBase.getAllStudents().stream().filter(element -> element.getGpa() >=3.9).findFirst());
    	
    }
}
