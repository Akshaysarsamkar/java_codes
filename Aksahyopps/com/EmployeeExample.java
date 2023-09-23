 package Aksahyopps.com;
import java.util.Scanner;
class Emp1{
	int id;
	String name;
	float sal;
	
	Emp1(int id,String name,float sal){
		this.id= id;
		this.name = name;
		this.sal  = sal;
	}

	public Emp1() {
	
	}

	void show() {
		System.out.println();
		System.out.println("Emp Name:"+name);
		System.out.println("Emp Id is:"+id);
		System.out.println("Emp Sal:"+sal);
	}
	
	void Maxsal(Emp1 arr[],float max) {
		Emp1 a = new Emp1();
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i].sal > max) {
				a = arr[i];
			}
		}
		System.out.println("Name is:"+a.name);
		System.out.println("ID isP:"+a.id);
		System.out.println("Salary is:"+a.sal);

	}
	
}


public class EmployeeExample {

	public static void main(String[] args) {
		
		Emp1 arr[] = new Emp1[5];
		Emp1 a = new Emp1();
		arr[0] = new Emp1(12,"Akshay",34.5f);
		arr[1] = new Emp1(2,"Karan",35.5f);
		arr[2] = new Emp1(1,"sam",40.5f);
		arr[3] = new Emp1(36,"RAj",4.5f);
		arr[4] = new Emp1(12,"Ram",4.5f);
		for(int i=0;i<arr.length;i++) {
			 arr[i].show();
		}
		
		float max = arr[0].sal;

		System.out.println("1");

		System.out.println();
		System.out.println("Max salary Emp is:");
		arr[4].Maxsal(arr,max);

		
	}  

}
