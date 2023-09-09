package Aksahyopps.com;
//Write a Java program create class as MyDate with dd,mm,yy 
//as data members. Write
//default and parameterized constructor.
//Display the date in dd-mm-yy format.(Use this
//keyword)

class MyDate{
	int dd,mm,yy;
	
	MyDate()
	{
		dd = 20;
		mm =01;
		yy =2021;
	}
	
	MyDate(int dd,int mm,int yy)
	{
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}
	
	void display()
	{
		System.out.println(dd +"/" +mm + "/" + yy);
	}
}



public class Date {

	public static void main(String[] args) {

      MyDate d1 = new MyDate();
      d1.display();
      MyDate d2 = new MyDate(10,05,2022);
      d2.display();
	}

}
