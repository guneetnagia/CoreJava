/**
 * Immutable class
 * Java examples are String class, Wrapper classes like Integer.
 * Don’t provide “setter” methods — methods that modify fields or objects referred to by fields.
 * Make all fields private and final.
 * Make class as final  or construct private constructor and construct
 * Special attention when having mutable instance variables. Return new objects with copied content for all mutable objects.
 *
 * If the instance fields include references to mutable objects, don't allow those objects to be changed:
 * 		-Don't provide methods that modify the mutable objects
 * 		-Don't share references to the mutable objects. Never store references to external, mutable objects passed to the constructor; if necessary, create copies, and store references to the copies. Similarly, create copies of your internal mutable objects when necessary to avoid returning the originals in your methods
 *
 * Thread safe class
 */
package com.example.oops;

import java.util.Date;

public final class Sample3 {
	public static void main(String aaa[]){
		ImmutableClass imm = new ImmutableClass(11, "james", new Date());
		System.out.println(imm);
	}
}

class ImmutableClass{
	private final int id;
	private final String name;
	private final Date date;
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public ImmutableClass(int id, String name, Date date){
		this.id=id;
		this.name=name;
		this.date=new Date(date.getTime());
	}
	public Date getDate(){
		return (Date) date.clone();
	}
	@Override
	public String toString() {
		return "ImmutableClass [id=" + id + ", name=" + name + ", date=" + date
				+ "]";
	}
}

