/*
 * Child class is automatically serialized,if parent is serialized, vice-versa not possible
 * only non static variables are serialized
 * transient data member and static data member are not saved in serialization
 * constructor of object is never called if an object is deserialized
 * Must implement serialization
 */

package guneet.serialize;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerialExample {
	public static void main(String aaa[]){
		
		Contractors emp1 = new Contractors(10, 20, 30, 40, 50);
		
		try {
			FileOutputStream fos = new FileOutputStream("E:\\GitProjects\\Java\\core\\CoreJava\\text.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(emp1);
			oos.close();
			fos.close();
			System.out.println("State of object is converted to byte stream");
			printdata(emp1);
			////////////////////////////////////////////////////////////
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	public static void printdata(Contractors object1) 
	{ 

		System.out.println("A = " + object1.A); 
		System.out.println("B = " + object1.B); 
		System.out.println("C = " + Emp.C); 
		System.out.println("D = " + object1.D);
		System.out.println("E = " + object1.E);
	} 
}



class Emp implements Serializable{
	private static final long serialversionUID  = 23L;
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

class Contractors extends Emp{
	int E;
	public Contractors(int A, int B, int C, int D, int E) {
		super(A, B, C, D);
		this.E = E;
	}
	//private static final long serialVersionUID = -7379038688377297197L;
	
}