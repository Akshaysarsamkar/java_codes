package inheritance.com;

class A{
	void msg()
	{
		System.out.println("msg method in A class");
	}
}

class B extends A{
	void msg() {
		System.out.println("msg method in B class");
	}
}

public class MethodOverridingEx {

	public static void main(String[] args) {
		
		 A b1 = new B();
		 b1.msg();
	}

}
