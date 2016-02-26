/**
 * Reflection sample example
 */
package com.example.oops;

import java.lang.reflect.Method;

public class Sample12 {
	public static void main(String aaa[]){
		Class className = ReflectionExample.class;  //if class name is known at compile time
		System.out.println(className);

		// if class name is not known at compile time, and have class name as string, we can use below
//		Class className1 = Class.forName("FullyQualifiedName");   //ClassNotFoundException at runtime if class is not found at classPath

		String classNameFull = className.getName(); //fully qualified name
		String classNameOnly = className.getSimpleName(); //without package name

		Method[] method = className.getMethods();
		System.out.println("------methods are---------");
		for(Method meth:method){
			System.out.println(" "+meth);
		}
		System.out.println(" ------------  ");

		//----------------------------


		ClassLoader classLoader = Sample12.class.getClassLoader();
		try {
			Class aclass = classLoader.loadClass("com.example.oops.ReflectionExample");
			System.out.println("class name is : " + aclass.getName());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	//java class loader always checks if class is loaded before loading the class, so reloading is not possible using Java's class loader,
	//so we have to implement our own class loader

}

class ReflectionExample{
	private int instance;
	public void show(){

	}
	public int getInstance() {
		return instance;
	}
	public void setInstance(int instance) {
		this.instance = instance;
	}
}
