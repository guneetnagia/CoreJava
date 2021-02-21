package com.learnJava.streams;

import com.learnJava.data.StudentDataBase;

public class StreamsMaxMinExample {

    public static void main(String[] args) {
    	System.out.println(StudentDataBase.getAllStudents()
    	.stream()
    	.reduce((a,b)-> (a.getGpa() > b.getGpa()) ? a:b).get());
    	
    	System.out.println(StudentDataBase.getAllStudents()
    	    	.stream()
    	    	.reduce((a,b)-> (a.getGpa() < b.getGpa()) ? a:b).get());
    }
}
