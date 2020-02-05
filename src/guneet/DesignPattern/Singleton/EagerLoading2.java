package guneet.DesignPattern.Singleton;

public class EagerLoading2 {

}

class SingleTon2{
	private SingleTon2(){};
	private static SingleTon2 instance = new SingleTon2();
	public SingleTon2 getInstance(){
		return SingleTon2.instance;
	}
	
}