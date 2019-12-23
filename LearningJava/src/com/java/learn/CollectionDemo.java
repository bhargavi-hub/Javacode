package com.java.learn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionDemo {

	public static void main(String[] args) {
		
		List<Integer> values = new ArrayList<>(); // List is Mutable //Generics will allow only the type of values it is created
		values.add(9); // Internally this is a wrapper class Integer.. will create Integer object 
		values.add(5);
		values.add(4);
		values.add(8);
		
		/*for(int i=0;i<values.size();i++){
			System.out.println(values.get(i));
		}*/

		Collections.sort(values); //To sort the list
		Collections.reverse(values); //To reverse the list
		for(Integer o : values){
			System.out.println(o);
		}
			
	}

}
