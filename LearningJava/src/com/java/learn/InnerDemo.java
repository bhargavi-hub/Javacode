package com.java.learn;

class Outer{
	
	class Inner{
		
		public void display(){
			System.out.println("Inside Inner disaply method");
		}
		
	}
}

public class InnerDemo {

	public static void main(String[] args) {
		
		Outer outObj = new Outer();
		Outer.Inner obj = outObj.new Inner();
		
		obj.display();

	}

}
