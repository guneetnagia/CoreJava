package guneet.DesignPattern.Singleton;

public class EagerLoading1 {

}
class SingleTon1{
	private static SingleTon1 instance;
	//private constructor
	private SingleTon1(){
		
	}
	{
		instance = new SingleTon1();
	}
}