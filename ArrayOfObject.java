package Aksahyopps.com;
import java.util.*;
public class ArrayOfObject{
	String name;
	int id;
	float sal;
	
	ArrayOfObject(String name,int id,float sal){
		this.name=name;
		this.id=id;
		this.sal = sal;
	}
	
	void display() {
		System.out.println("id is:"+id+" name is:"+name+" salary is:"+sal);
	}
	public static void main(String[] args) {
		ArrayOfObject arr[] = new ArrayOfObject[5];
		
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<2;i++) {
			System.out.println("Enter the name");
			String name = sc.next();
			
			System.out.println("Enter the id");
			int id = sc.nextInt();
			
			System.out.println("Enter the salary");
			float sal = sc.nextFloat();
			
			arr[i] = new ArrayOfObject(name,id,sal);
		}
		
		for(int i=0;i<2;i++)
		{
			arr[i].display();
		}
	}

}
