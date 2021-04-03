package guneet.misc;

public final class ImmutablePassTest {
	private final int a;
	private final Person p;
	
	public int getA() {
		return a;
	}

	public Person getP() {
		return p;
	}
	public ImmutablePassTest(int a, Person p) {
		this.a = a;
		Person pclone = new Person(p.getAge(),p.getName());
		//pclone.setAge(p.getAge());
	//	pclone.setName(p.getName());
		this.p = pclone;
	}
	
	public static void main(String aaa[]){
		Person p1 = new Person(33,"guneet");
		ImmutablePassTest it1 = new ImmutablePassTest(10, p1);
		System.out.println(it1.getP().getAge());
		p1.setAge(32);
		System.out.println(it1.getP().getAge());
	}
}