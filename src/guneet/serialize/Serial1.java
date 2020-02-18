package guneet.serialize;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serial1 {
	public static void main(String aaa[]){
		SuperChild sp = new SuperChild(1,2,3,4);
		
		try {
			FileOutputStream fos = new FileOutputStream("E:\\GitProjects\\Java\\core\\CoreJava\\text2.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(sp);
			oos.close();
			fos.close();
			
			
			FileInputStream fis = new FileInputStream("E:\\GitProjects\\Java\\core\\CoreJava\\text2.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			SuperChild sp2 = (SuperChild)ois.readObject();
			
			oos.close();
			fis.close();
			
			show(sp2);
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
	
	public static void show(SuperParent sp){
		System.out.println(sp.a);
	}
}


class SuperParent {
	int a;
	public SuperParent(int a){
		this.a = a;
	}
}

class Parent extends SuperParent implements Serializable{
	int b;
	public Parent(int a,int b){
		super(a);
		this.b = b;
	}
}

class Child extends Parent{
	int c;
	public Child(int a, int b,int c){
		super(a,b);
		this.c = c;
	}
}

class SuperChild extends Child {
	int d;
	public SuperChild(int a,int b,int c,int d){
		super(a,b,c);
		this.d = d;
	}
}
