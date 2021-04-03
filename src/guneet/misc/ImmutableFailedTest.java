package guneet.misc;

public final class ImmutableFailedTest {
	private final int a;
	private final Person p;
	
	public int getA() {
		return a;
	}

	public Person getP() {
		return p;
	}
	public ImmutableFailedTest(int a, Person p) {
		this.a = a;
		this.p = p;
	}
	
	public static void main(String aaa[]){
		Person p1 = new Person(33,"guneet");
		ImmutableFailedTest it1 = new ImmutableFailedTest(10, p1);
		System.out.println(it1.getP().getAge());
		// After constructor if i modify the state of object
		p1.setAge(32);
		System.out.println(it1.getP().getAge());
		// oops it1 is modified
	}
}

class Person{
	private int age;
	private String name;
	public Person(){
	}
	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}