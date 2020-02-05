package guneet.DesignPattern.Singleton;

public class DoubleCheckLock {

}


class SingleTon5{
	private SingleTon5(){
		
	}
	private static SingleTon5 instance = null;
	public static SingleTon5 getInstance(){
		if(instance == null){
			synchronized (SingleTon5.class) {
				if(instance == null){
					instance = new SingleTon5();
				}
			}
		}
		return instance;
	}
}