package com.learnJava;

import java.time.LocalDate;

public class Employee implements Comparable<Employee>{
	private Long employeeId;
	private LocalDate doj;
	public Long getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}
	
	public Employee() {
		super();
	}

	public LocalDate getDoj() {
		return doj;
	}
	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}
	@Override
	public int compareTo(Employee e){
		return getDoj().compareTo(e.getDoj());
	}
	public Employee(Long employeeId, LocalDate doj) {
		super();
		this.employeeId = employeeId;
		this.doj = doj;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", doj=" + doj + "]";
	}
	
	
}
