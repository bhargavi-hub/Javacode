package com.java.learn;

public class ArrayDemo {

	public static void main(String[] args) {
		int arr[][] = { 
				{2, 3, 4, 5},
				{5, 3, 7, 3},
				{7, 8, 9, 10},
				{4, 9, 5, 8}
		};
		
		
		/*for(int i=0; i<arr.length; i++){
			for (int j=0;j<arr[i].length;j++){
				System.out.print(" " + arr[i][j]);
			}
			System.out.println(" ");
		}*/
		
		/** Enhanced for loop*/
		
		for(int k[] : arr){
			for(int l : k){
				System.out.print(" " + l);
			}
			System.out.println("");
		}
	}

}
