package guneet.interview.java4s;

import java.io.Serializable;

public class SingleTonClass implements Cloneable, Serializable{
	
	private SingleTonClass(){}
	
	private static class INNER{
		private static final SingleTonClass instance = new SingleTonClass();
	} 
	
	public SingleTonClass getInstance(){
		return INNER.instance;
	}
	
	public Object clone() throws CloneNotSupportedException{
		throw new CloneNotSupportedException();
	}
	
	protected Object readResolve(){
		return INNER.instance;
	} 
}
