package com.learnJava.streams;

import com.learnJava.data.StudentDataBase;

public class StreamsMatchExample {

    public static void main(String[] args) {
    	System.out.println(StudentDataBase.getAllStudents().stream().anyMatch(element -> element.getGpa() >=3.9));
    	
    	System.out.println(StudentDataBase.getAllStudents().stream().allMatch(element -> element.getGpa() >=3.9));
    	
    	System.out.println(StudentDataBase.getAllStudents().stream().noneMatch(element -> element.getGpa() >=5));
    }
}
