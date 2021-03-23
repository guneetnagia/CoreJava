package guneet.java8.misc;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class DBS1 {
	public static void main(String args[]){
		String s1 = "test";
//Error 1		// Comparator<String> comp = (s1,s2) -> s1.length()-s2.length();
		int i=0;
		List<Employee> list = new ArrayList<>();
		list.stream().filter(o->o.getId()>2).map(o -> {
//Error 2		// i++;
			return o.getId();
		}).collect(Collectors.toList());
		System.out.println(i);
	}
}

class Employee{
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}
