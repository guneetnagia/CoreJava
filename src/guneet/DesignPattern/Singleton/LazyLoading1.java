package guneet.DesignPattern.Singleton;

public class LazyLoading1 {
	public static void main (String aaa[]){
		SingleTon3 instance1 = SingleTon3.getInstance();
		SingleTon3 instance2 = SingleTon3.getInstance();
		SingleTon3 instance3 = SingleTon3.getInstance();
		
		instance1.s = "Something new";
		
		System.out.println(instance1.s);
		System.out.println(instance2.s);
		System.out.println(instance3.s);
	}
}


class SingleTon3{
	public String s;
	private SingleTon3(){
		s="Test";
	}

	private static SingleTon3 instance;

	public static SingleTon3 getInstance(){
		if(instance == null){
			instance = new SingleTon3();
		}

		return instance;
	}
}