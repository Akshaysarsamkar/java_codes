package Aksahyopps.com;
public class Student {
     
	int rollno;
	String name;
	
	Student()
	{
		rollno = 12;
		name = "Sujit kargal";
	}
	
	Student(int rollno,String name){
		this.rollno=rollno;
		this.name=name;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + "]";
	}
	
	

	
}
