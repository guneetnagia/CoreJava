package guneet.DesignPattern.Singleton;

public class InnerClassWay {

}


class SingleTon6{
	private SingleTon6() {
		// TODO Auto-generated constructor stub
	}
	
	private static class InnerClass{
		private static SingleTon6 instance = new SingleTon6(); 
	} 
	
	public static SingleTon6 getInstance(){
		return InnerClass.instance;
	}
	
}