package com.java.learn;

class A{
	
	public void show(){
		System.out.println("Inside A");
	}
	
}

public class AnanymousExample {

	public static void main(String[] args) {
		
		A obj = new A(){ // This is an Anonymous class
			
			public void show(){
				System.out.println("Anonymous class here here...");
			}
		};
		
		obj.show();
	}

}
