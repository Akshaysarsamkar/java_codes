package Akshayjava.com;

public class Javaprogram {
	
	//first program
	void msg()
	{
		System.out.println("Hello world");
	}

	
	//second program
		void info()
		{
			System.out.println();
			System.out.println("*******************************************");
			System.out.println("personal info programm");
			System.out.println("Name is:Akshay sarsamkar");
			System.out.println("class:TYBCA{SCI]");
			System.out.println("Address:keshnand road wagholi");
			System.out.println("Phone no:3652147852");
			System.out.println("Dream:Software developer");
			System.out.println("collage:BJS collage wagholi");
			System.out.println("*******************************************");
		}
		
		
		void byterange()
		{
			System.out.println();
			byte b = 61;
			// byte b1 = 564;   out of range give error
			System.out.println();
			System.out.println("Byte b:"+b);
			//System.out.println("Byte b:"+b1);
		}

		
		void intrange()
		{
			int i = 61;
			//int i1 = 5645555555555555555;   out of range give error
			System.out.println();
			System.out.println("Int I:"+i);
			//System.out.println("Int i1:"+i1);
		}
	
		
		void floatrange()
		{
			System.out.println();
			float f = 61.89f;
			//float f1 = 565727287436.66666666666f;   out of range give error
			System.out.println();
			System.out.println("Float f:"+f);
			//System.out.println("Float f2:"+f1);
		}
	
		void longrange()
		{
			System.out.println();
		   long l = 31;
			//long l1 = 56572728743545454421548452154784524154452;   out of range give error
			System.out.println();
			System.out.println("Long l:"+l);
			//System.out.println("Long l:"+l1);
		}
	
		void shortrange()
		{
			System.out.println();
		   short s = 81;
			//short s1 = 56572728743545454421548452154784524154452;   out of range give error
			System.out.println();
			System.out.println("short s:"+s);
			//System.out.println("short s1:"+s1);
		}
	
		
		void doublerange()
		{
			System.out.println();
		   double d = 552.1;
			//double d1 = 56572728743545454421.548452154784524154452;   out of range give error
			System.out.println();
			System.out.println("double d:"+d);
			//System.out.println("double d1:"+d1);
		}
	
		void comment()
		{
			System.out.println();
			//comment program
			System.out.println("comment program single line comment(//)");
			System.out.println("comment program multiline line comment(/* */)");
		}
		
		void oddeven(int n) {
			System.out.println();
			if(n % 2 == 0)
			{
				System.out.println(n+" number is even");
			}
			else {
				System.out.println(n+" number is odd");
			}
		}
		
		void leapyear(int year) {
			System.out.println();
			if(year % 4 == 0)
			{
				System.out.println(year +" is leap");
			}
			else {
				System.out.println(year +" not is leap");
			}
		}
		
		void onedarray()
		{
			System.out.println();
			System.out.println("1-d array:");
			for(int i=0;i<14;i++)
				System.out.print(i + " ");
			
		}
		
		
		void twodarray()
		{
			System.out.println();
			System.out.println();
			System.out.println("2-d array:");
			for(int i=0;i<5;i++) {
				for(int j=0;j<5;j++) {	
				 System.out.print(j+ " ");
			}
			System.out.println();
		}
		}
		
		
		void oddevenmatrix()
		{
			
				System.out.println();
				System.out.println("even in array:");
				for(int i=0;i<14;i++)
					if(i % 2 == 0)
					 System.out.print(i + " ");
				
				System.out.println();
				System.out.println("even in array:");
				for(int i=0;i<14;i++)
					if(i % 2 != 0)
					 System.out.print(i + " ");
		}
		
		
	public static void main(String[] args) {
		
	     Javaprogram  j = new Javaprogram ();
		 j.msg();
		 j.info();
		 j.byterange();
		 j.intrange();
		 j.floatrange();
		 j.longrange();
		 j.shortrange();
		 j.doublerange();
		 j.comment();
		 int b =98;
		 j.oddeven(b);
		 j.leapyear(2021);
		 j.onedarray();
		 j.twodarray();
		 j.oddevenmatrix();
		
	}

}
