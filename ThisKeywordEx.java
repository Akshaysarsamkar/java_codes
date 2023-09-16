package Aksahyopps.com;

public class ThisKeywordEx {
	int id;
	String name;
	
//	ThisKeywordEx(String name,int id){
//		
//		this.name = name;
//		this.id = id;
//	}
	
	void display()
	{
		System.out.println("id is:"+id+" name is:"+name);
	}
	public static void main(String[] args) {
		ThisKeywordEx thisKeywordEx = new ThisKeywordEx();
//		ThisKeywordEx obj1 = new ThisKeywordEx("Akshay",12);
//		obj1.display();
	}

}
