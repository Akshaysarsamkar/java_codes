package Aksahyopps.com;

//
//. Define a “Point” class having members – x,y(coordinates). 
//Define default constructor and 
//parameterized constructors. Define two subclasses “ColorPoint” 
//with member as color and
//subclass “Point3D” with member as z (coordinate). 
//Write display method to display the 
//details of different types of Points.



class Point{
	int x,y;
	
	Point(){
		x=20;
		y=69;
	}
	
	Point(int x,int y){
		this.x =x;
		this.y =y;
	}
}

class ColorPoint extends Point{
	
	String color;
	
	ColorPoint(String color,int a,int b){
		super(a,b);
		this.color=color;
	}
	
	void display(){
	  System.out.println("color name is:"+color);
	  System.out.println("Value of X is:"+super.x);
	  System.out.println("Value of y is:"+super.y);
	  
	}
}

class Point3D extends Point{
	
	int z;
	
	Point3D(int a,int b,int c){
		super(a,b);
		z = c;
	}
	
	void display(){
		  System.out.println("Value of z is:"+z);
		  System.out.println("Value of X is:"+super.x);
		  System.out.println("Value of y is:"+super.y);
		}
	
}


public class InheritanceExample1 {

	public static void main(String[] args) {
		
		ColorPoint obj1 = new ColorPoint("Red",12,32);
		obj1.display();
		Point3D obj2 = new Point3D(540,120,320);
		obj2.display();
		
	}

}
