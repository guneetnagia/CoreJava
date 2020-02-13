package guneet.serialize;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class DeserializeObject {
	public static void printdata(Contractors object1) 
	{ 
		System.out.println("A = " + object1.A); 
		System.out.println("B = " + object1.B); 
		System.out.println("C = " + Emp.C); 
		System.out.println("D = " + object1.D); 
		System.out.println("E = " + object1.E);
	} 
	public static void main(String aaa[]){
		try {
			FileInputStream fis = new FileInputStream("E:\\GitProjects\\Java\\core\\CoreJava\\text.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Contractors emp2 = (Contractors) ois.readObject();
			printdata(emp2);
			ois.close();
			fis.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}


class Emp implements Serializable{
	private static final long serialversionUID  = 9L;
	int A;
	int B;
	static int C;
	transient int D;

	public Emp(int A,int B, int C, int D){
		this.A = A;
		this.B = B;
		Emp.C = C;
		this.D = D;
	}
}
