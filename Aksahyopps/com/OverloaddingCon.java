package Aksahyopps.com;

public class OverloaddingCon {

	int a,b,ans=0;
	float c;
	OverloaddingCon(int a,int b) //overloading constructor
	{
		this.a = a;
		this.b = b;
		ans = a+b;
		System.out.println("sum is:"+ans);
	}
	
	OverloaddingCon(float a,int b) //overloading constructor
	{
		c = a;
		this.b = b;
		System.out.println(c+b);
	}
	public static void main(String[] args) {
		
		OverloaddingCon x = new OverloaddingCon(10.5f,34);
		OverloaddingCon x1 = new OverloaddingCon(45,78);

	}

}
