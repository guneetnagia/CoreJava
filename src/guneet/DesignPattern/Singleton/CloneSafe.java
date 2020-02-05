package guneet.DesignPattern.Singleton;

public class CloneSafe {

}

class SingleTon7 implements Cloneable{
	@Override
	public Object clone() throws CloneNotSupportedException{
		throw new CloneNotSupportedException();
	}
	private SingleTon7(){
		
	}
	private static SingleTon7 instance = null;
	public static SingleTon7 getInstance(){
		if(instance == null){
			synchronized (SingleTon7.class) {
				if(instance == null){
					instance = new SingleTon7();
				}
			}
		}
		return instance;
	}
}