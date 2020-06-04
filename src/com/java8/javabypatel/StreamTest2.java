package com.java8.javabypatel;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest2 {
	public static void main(String aaa[]){
		//5. Create a List<Student> from the List<TempStudent>

		TempStudent tmpStud1 = new TempStudent(
				"Jayesh1",
				201,
				new Address(12341L),
				Arrays.asList(new MobileNumber(12331L), new MobileNumber(12341L)));

		TempStudent tmpStud2 = new TempStudent(
				"Khyati1",
				202,
				new Address(12351L),
				Arrays.asList(new MobileNumber(11111L), new MobileNumber(33331L), new MobileNumber(12331L)));

		List<TempStudent> tmpStudents = Arrays.asList(tmpStud1, tmpStud2);

		List<Student> students = tmpStudents.stream().map(std -> new Student(std.name, std.age, std.address, std.mobileNumbers)).collect(Collectors.toList());
		System.out.println(students);
	}
}
