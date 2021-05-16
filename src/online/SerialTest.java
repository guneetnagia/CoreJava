package online;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


public class SerialTest implements Serializable{
	private static A a = new A();
	public static void main(String aaa[]){
		SerialTest b = new SerialTest();
		try{
			FileOutputStream fs = new FileOutputStream("b.ser");
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(b);
			os.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}
