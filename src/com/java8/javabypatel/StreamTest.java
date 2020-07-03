package com.java8.javabypatel;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;


public class StreamTest {
	public static void main(String aaa[]){
		System.out.println("start");
		Student student1 = new Student("Jayesh", 20, new Address(410014L), Arrays.asList(new MobileNumber(9090909090L), new MobileNumber(8080808080L)));
		Student student2 = new Student("Khyati", 20, new Address(1235L), Arrays.asList(new MobileNumber(7777777777L), new MobileNumber(666666666L)));
		Student student3 = new Student("Jason", 20, new Address(3333L), Arrays.asList(new MobileNumber(123212345L), new MobileNumber(556666666L)));
		Student student4 = new Student("Jayesh", 20, new Address(410014L), Arrays.asList(new MobileNumber(9090909090L), new MobileNumber(8080808080L)));
		
		List<Student> students = Arrays.asList(student1,student2,student3,student4);
		
		// 1. 	Get student with exact match name "jayesh"
		List<Student> result1 = students.stream().filter(x -> x.getName().equals("Jayesh")).collect(Collectors.toList());
		Optional<Student> result1_1 = students.stream().filter(x->x.getName().equals("Jayesh")).findFirst();
		System.out.println(result1_1.isPresent() ? result1_1.get().getName() : Optional.empty());
		
		//2. Get student with matching address "1235"
		List<Student> result2 = students.stream().filter(x -> x.getAddress().getZipcode().equals(1235L)).collect(Collectors.toList());
		System.out.println(result2.size());
		
		//3. Get all student having mobile numbers 9090909090L.
		List<Student> result3 = students.stream().filter(x -> x.getMobileNumbers().stream().anyMatch(mob -> mob.getNumber().equals(9090909090L))).collect(Collectors.toList());
		String s1 = result3.stream().map(std -> std.getName()).collect(Collectors.joining(","));
		System.out.println(s1);
		
		//4.  Get all student having mobile number 123212345L and 556666666L
		List<Student> result4 = students.stream().filter(student -> student.getMobileNumbers().stream().allMatch(mob -> mob.getNumber() == 556666666L && mob.getNumber() == 123212345L)).collect(Collectors.toList());
		String s2 = result4.stream().map(std -> std.getName()).collect(Collectors.joining(","));
		System.out.println(s2);
		

		//6.   Convert List<Student> to List<String> of student name
		String s = students.stream().map(std -> std.getName()).collect(Collectors.joining(", "));
		System.out.println(s);
		
		//7.   Change the case of List<String>
		List<String> nameList =
	            Arrays.asList("Jayesh", "Dany", "Khyati", "Hello", "Mango");
		
		String s3 = nameList.stream().map(std -> std.toUpperCase()).collect(Collectors.joining(", "));
		System.out.println(s3);
		
		//8.   Sort List<String>
		  List<String> namesList =
		            Arrays.asList("Jayesh", "Dany", "Khyati", "Hello", "Mango");
		  namesList.stream().sorted().forEach(System.out::println);
		  
		//9.   Conditionally apply Filter condition, say if flag is enabled then 
	}
}
