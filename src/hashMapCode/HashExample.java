package hashMapCode;

public class HashExample {
	public static void main(String aaa[]){
		Employee e1 = new Employee(23);
		Employee e2 = new Employee(3);
		System.out.println(e1.equals(e2));
	}
	
}
class Employee{
	private int age;
	public Employee(int age){
		this.age=age;
	}
	
	public int hashCode(){
		return age;
	}

	@Override
	public boolean equals(Object obj) {
		Employee emp = (Employee)obj;
		if(emp.age==age){
			return true;
		}
		else
			return false;
	}
	
}
