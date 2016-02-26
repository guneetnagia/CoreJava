package com.example.collection;

public class Sample31 {
	public static void main(String aaa[]){
		A a1 = new A();
		A a2 = new A();
		System.out.println(a1==a2);
		System.out.println(a1.equals(a2));
	}
}

class A{
	int i=9;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + i;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		A other = (A) obj;
		if (i != other.i)
			return false;
		return true;
	}

}