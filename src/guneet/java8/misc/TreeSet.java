package guneet.java8.misc;

import java.util.Set;

public class TreeSet {
	public static void main(String args[]){
		Set<Student> set  = new java.util.TreeSet<>
			((a,b)->a.getId()<b.getId()?-1:a.getId()>b.getId()?1:0);
		set.add(new Student(1, "B", 10));
		set.add(new Student(2, "B", 80));
		set.add(new Student(3, "C", 50));
		set.add(new Student(4, "D", 70));
		set.add(new Student(5, "E", 90));
		System.out.println(set);
	}
}

class Student{
	private int id;
	private String name;
	private int totalMarks;
	
	public Student(int id, String name, int totalMarks) {
		super();
		this.id = id;
		this.name = name;
		this.totalMarks = totalMarks;
	}
	
	
	public int getTotalMarks() {
		return totalMarks;
	}
	public void setTotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", totalMarks=" + totalMarks + "]";
	}
}