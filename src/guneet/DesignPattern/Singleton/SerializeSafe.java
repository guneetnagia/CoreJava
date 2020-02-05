package guneet.DesignPattern.Singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializeSafe {
	public static void main(String aaa[]){


		try {
			SingleTon9 instance = SingleTon9.getInstance();
			ObjectOutput out = new ObjectOutputStream(new FileOutputStream("file.txt"));
			out.writeObject(instance);
			out.close();

			// de-serialize 
			ObjectInput in = new ObjectInputStream(new FileInputStream("file.txt"));
			SingleTon9 newInstance  = (SingleTon9) in.readObject();
			in.close();

			System.out.println("instance1 hashCode:- "
					+ instance.hashCode()); 
			System.out.println("instance2 hashCode:- "
					+ newInstance.hashCode()); 
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class SingleTon9 implements Serializable{
	private SingleTon9(){

	}
	private static SingleTon9 instance = null;
	public static SingleTon9 getInstance(){
		if(instance == null){
			synchronized (SingleTon9.class) {
				if(instance == null){
					instance = new SingleTon9();
				}
			}
		}
		return instance;
	}
	
	// fix of Serialization
	 protected Object readResolve() 
	    { 
	        return instance; 
	    } 
}