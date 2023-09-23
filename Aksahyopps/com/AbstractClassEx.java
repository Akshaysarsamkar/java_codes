package Aksahyopps.com;

import java.util.Scanner;

abstract class Staff{
	String name,adds;
 abstract void calculateSalary();
}

class FullTimeStaff extends Staff{
	
    String department;
    float salary;
    float s;
    float hra;
    float da;
 
    FullTimeStaff(float salary,String name,String d,String adds){
    	this.salary=salary;
    	da = (salary * 5)/100;
    	hra = 8 * salary/100;
    	this.name = name;
    	department = d;
    	this.adds = adds;
    
    }

    void calculateSalary() {
    	s = salary+hra+da;
    	System.out.println("name of of emp:"+name);
		System.out.println("adds of student is:"+adds);
		System.out.println("department is:"+department);
    	System.out.println("total salary is:"+s);
    }
}

class PartTimeStaff extends Staff{
	int number_of_hours,rate_per_hour;
	
	PartTimeStaff(int a,int b,String name,String adds){
		number_of_hours=a;
		rate_per_hour=b;
		this.name = name;
    	this.adds = adds;
		
	}
	void calculateSalary() {
		System.out.println("name of of emp:"+name);
		System.out.println("adds of student is:"+adds);
        System.out.println("Total salary is:"+number_of_hours*rate_per_hour);
    }
	
	
}

public class AbstractClassEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your choice");
		System.out.println("1:FullTimeStaff");
		System.out.println("2:PartTimeStaff");
		int ch =  sc.nextInt();
		
		if(ch==1) {
		 FullTimeStaff f = new  FullTimeStaff(30000f,"Akshay","BCA","pune");
		 f.calculateSalary();
		}
		else if(ch ==2){
			 PartTimeStaff f = new PartTimeStaff(12,580,"Akshay","pune");
			 f.calculateSalary();
		}
		else {
			System.out.println("invalid");
		}
	}
	 
}
