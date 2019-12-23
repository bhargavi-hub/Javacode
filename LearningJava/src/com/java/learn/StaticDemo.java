package com.java.learn;

class Employee{

	int empNo;
	String empName;
	int salary;
	static String ceo;
	
	/** block to initialize static variable - executed when the class is loaded */
	static{
		ceo = "Srinivas";
	}
	
	/** Constructor to initialize values - executed when the object is created */ 
	public Employee(int empNo, String empName, int salary){
		this.empNo = empNo;
		this.empName = empName;
		this.salary = salary;
	}
	
	/* Method to display values */
	public void show(){
		System.out.println("Emp Number:"+ empNo + "\tEmp Name:" + empName + "\tSalary:" + salary +"\tCEO:" + ceo);
		
	}
	

}

public class StaticDemo{
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Employee bh = new Employee(2,"Bhargavi", 8000);
			Employee sh = new Employee(3, "Sai Harshitha" , 15000);
			
			bh.show();
			sh.show();
		
		}
}