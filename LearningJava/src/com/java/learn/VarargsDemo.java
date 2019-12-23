package com.java.learn;

class Calc{
	
	public int add(int ... n){
		int sum = 0;
		for(int i : n)
		{
			sum = sum + i;
		}
		return sum;
	}
}

public class VarargsDemo {

	public static void main(String[] args) {
		
		Calc obj = new Calc();
		System.out.println(obj.add(3,4,6,9, 56, 89));
	}

}
