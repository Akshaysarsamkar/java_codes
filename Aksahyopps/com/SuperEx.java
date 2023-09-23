package Aksahyopps.com;

class A{
	 int i;
}

public class SuperEx extends A {
	int i;
	
	SuperEx(int a,int b){
		super.i = a;
		i = b;
	}
	
	void show()
	{
		System.out.println(super.i);
		System.out.println(i);
		
	}

	public static void main(String[] args) {
		
		SuperEx obj = new SuperEx(10,20);
		obj.show();
	}

}
