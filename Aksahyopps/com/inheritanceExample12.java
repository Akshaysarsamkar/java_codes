package Aksahyopps.com;

class Employee {
	
	String name;
	float salary;
	
	Employee(String name,float salary){
		this.name = name;
		this.salary=salary;
	}
	
	
}

class Developer extends Employee{
	String projectname;
	Developer(String name,float salary,String projectname){
		super(name,salary);
		this.projectname =projectname;
	}

	
}

class Programmer extends Developer{
	String proglanguage;
	Programmer(String name,float salary,String projectname,String proglanguage){
		super(name,salary,projectname);
		this.proglanguage = proglanguage;
	}
	
	public void  display() {
		System.out.println("Emp Name:"+super.name);
		System.out.println("Emp salary:"+super.salary);
		System.out.println("project name:"+super.projectname);
		System.out.println("proglanguage"+ proglanguage);
		
		
	}
}


public class inheritanceExample12 {

	public static void main(String[] args) {
		
		Programmer p1 = new Programmer("Akshay",50000f,"MoneyAppDevelopement","java");
		p1.display();
		
		System.out.println();
		Programmer p2 = new Programmer("Abhishek",50000f,"LibraryManagement","java+html+css");
		p2.display();

	}

}
