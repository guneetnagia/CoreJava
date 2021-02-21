package com.learnJava.streams_terminal;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;
import java.util.Set;

import static java.util.stream.Collectors.*;

public class StreamsMappingExample {

    public static void main(String[] args) {

    StudentDataBase.getAllStudents()
    .stream()
    .collect(mapping(Student::getName, toList()))
    .forEach(System.out::println);
    ;
    }

}
