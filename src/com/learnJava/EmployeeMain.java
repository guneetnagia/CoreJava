package com.learnJava;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeMain {
	
	
	public static void main(String aaa[]){
		Employee e1 = new Employee(1L, LocalDate.of(2020, 12, 25));
		Employee e2 = new Employee(4L, LocalDate.of(2021, 12, 15));
		Employee e3 = new Employee(3L, LocalDate.of(1920, 4, 5));
		Employee e4 = new Employee(2L, LocalDate.of(1978, 12, 10));
		Employee e5 = new Employee(5L, LocalDate.of(2021, 1, 5));
		
		List<Employee> list = new ArrayList<Employee>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		
		list.stream().sorted(Comparator.comparing(Employee::getDoj))
		.collect(Collectors.toList())
		.forEach(System.out::println);
		
	}
}
