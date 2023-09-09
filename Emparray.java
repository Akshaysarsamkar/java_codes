package Aksahyopps.com;
import java.util.NoSuchElementException;
import java.util.Scanner;
//. Write a java program which define class Employee
//with data member as name and salary.
//Program store the information of 5 Employees.(Use array of object)
class Emp{
	String name;
	float salary;
	
	Emp(String name,float salary) {
	this.name = name;
	this.salary = salary;
	}
	
	void display() {
		System.out.println("name is:"+name+" salary is:"+salary);
	}
}

public class Emparray  {

	public static void main (String[] args) throws Exception,NoSuchElementException{
	Scanner sc = new Scanner(System.in);
		Emp e[] = new Emp[5];
		for(int i=0;i<5;i++)																					
		{
			System.out.println("Enter the name and salary");
			String n = sc.next();
			

			float s = sc.nextFloat();
			
			e[i] = new Emp(n,s);
			
		}
		
		for(int i=0;i<5;i++)																					
		{
			e[i].display();
		}
	}

}
