package com.java.learn;

@FunctionalInterface //Interface that has only one method 
interface Abc
{
	void show();
}

class Implementor implements Abc
{
	public void show(){
		System.out.println("Inside Implementor");
	}
}

public class InterfaceDemo {

	public static void main(String[] args) {
		Abc obj1 = new Implementor();
		obj1.show();
	}
}
