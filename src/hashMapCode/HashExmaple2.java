package hashMapCode;

import java.util.HashSet;

public class HashExmaple2 {
	public static void main(String aaa[]){
		Emp e1 = new Emp(23);
		Emp e2 = new Emp(24);
		Emp e3 = new Emp(25);
		Emp e4 = new Emp(26);
		
		HashSet<Emp> employeeSet = new HashSet<>();
		employeeSet.add(e1);employeeSet.add(e2);employeeSet.add(e3);employeeSet.add(e4);
		
		System.out.println(employeeSet.contains(new Emp(23)));
	}
}

class Emp{
	private int age;
	
	public Emp(int age){
		this.age=age;
	}
	public int hashCode(){
		return age;
	}
	public boolean equals(Object obj){
		Emp emp = (Emp)obj;
		if(emp.age==age){
			return true;
		}
		return false;
	}
}