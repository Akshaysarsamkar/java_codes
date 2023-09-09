package Aksahyopps.com;

class superclass{
	superclass()
	{
		System.out.println("super consrtuctor");
	}
	void m1() {
		System.out.println("super hello");
		}
}

class subclass extends  superclass{
	
	subclass()
	{
		
		super();
		System.out.print("hello");
	}
	
	void m1() {
		System.out.println("sub hello");
		super.m1();
	}
	
}

public class Superkeyword {

	public static void main(String[] args) {
		 subclass s = new subclass();
		 s.m1();
	}

}
