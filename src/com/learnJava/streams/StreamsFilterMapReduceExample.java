package com.learnJava.streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class StreamsFilterMapReduceExample {

       public static void main(String[] args) {

    	   System.out.println(StudentDataBase.getAllStudents().stream()
    	   .map(Student::getNoteBooks)
    	   .reduce(0,(a,b)->a+b));
    	   
    	   System.out.println(StudentDataBase.getAllStudents().stream()
    	    	   .map(Student::getNoteBooks)
    	    	   .reduce(0,Integer::sum));
    }
}
