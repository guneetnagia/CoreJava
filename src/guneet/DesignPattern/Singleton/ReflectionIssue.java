package guneet.DesignPattern.Singleton;
/*
 * To resolve issues related to REflection, use ENUM, as it doesn;t have constructor and are only initiated once.
 */
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionIssue {

	public static void main(String aaa[]) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		SingleTon8 single = SingleTon8.getInstance();
		SingleTon8 doubles = null;

		Constructor[] constructor = SingleTon8.class.getConstructors();
		for(Constructor each: constructor){
			each.setAccessible(true);
			doubles = (SingleTon8) each.newInstance();
			break;
		}

		System.out.println("instance1.hashCode():- " 
				+ single.hashCode()); 
		System.out.println("instance2.hashCode():- " 
				+ doubles.hashCode()); 
	} 
}


class SingleTon8{
	private SingleTon8(){}
	private static SingleTon8 instance;
	public static SingleTon8 getInstance(){
		if(instance == null){
			instance = new SingleTon8();
		}
		return instance;
	}
}


