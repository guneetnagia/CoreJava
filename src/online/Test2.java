package online;

import java.util.Map;

public class Test2 {

}


1.Filter list of employees whose salary is greater than 5000 and output should be list of employee names


public class Employee{int id;String name;Address address;}



1.Filter list of employees whose salary is greater than 5000 and output should be list of employee names

list_employees.stream().filter(e->e.getSalary() > 5000)collect(Collectors.toList());

2.Write a sql query to find employee details along with address details(One employee can have have multiple addresses)
Table Employee     table Address
emp_id emp_name		empl_id address1
					empl_id address2
-----------------
select emp.* from Employee cinner join Address add
on emp.emp_id = add.emp_id;
------------------
Demonstrate same using hibernate entity mapping

3.Write a java program to find  non repetitive integers from integer array.sample i/p:{1,2,3,4,5,2,5}  
sample output:{1,3,4}.Dont use Collection.Use Core Java Logic
==hashmap==
Map<Integer,Integer> map = new HashMap<Integer>();
for(int i=0;i<n;i++) {
	if(map.containsKey(arr[i])) {
		map.put(arr[i], map.get(arr[i]) + 1);
	}
	else {
		map.put(arr[i], 1);
	}
}

for(int i=0;i<n;i++) {
	if(map.get(arr[i]) == 1) {}
	return arr[i];
}

==========
4.Demonstrate Implementation of Singletion Design Pattern
-- single object
-- thread safe, clonse safe, serialize safe, reflection safe
public class Employee implements clonable, serializable{
	private static Employee obj = null;
	
	private Employee() {
		
	}
	public static employee getInstance() {
		if(obj == null) {
			synchronized() {
				if(obj == null) {
					obj = new Employee();
				}
			}
		}
		return obj;
	}
	
	public void clone() {
		throws new CloneNotSupportedException()
	}
	public void read..(){
		throw new ...
	}
}


alternaet 

public Enum Employee{}
5.Make below class as immutable
public final class Employee{
	private final int id;private final String name;private final Address address;
	// no setters
	//getter

	public void getId() {return id;}
	public void getName() {return name;}
	public void getAddress() {// deep clone 
		Adress add_new = new Adress();
		add_new.setArea()
	}
	//constructor
	Employee(int id, String name, )
	}
	
}
