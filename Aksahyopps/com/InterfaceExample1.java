package Aksahyopps.com;
interface Operation{
  void area();
  void volume();
  final float pi= 3.142f;
	
}

class  circle  implements Operation{
	
	int r,h;
	circle(int radius,int height){
		r = radius;
		h = height;
	}
	
	public void area(){
		System.out.println("area of circle is:"+(2*pi*r*r));
	}
	
	public void volume() {
		System.out.println("volume of the Circle is:"+(pi * r * r * 2* h));
	}
	
}



class  cylinder implements Operation{
	
	int r,h;
	 cylinder(int radius,int height){
			r = radius;
			h = height;
		}
	
	public void area(){
		System.out.println("area of cylinder is:"+( 2 * pi * r * (r + h)));
	}
	
	public void volume() {
		System.out.println("volume of the cylinder is:"+(pi* r*r *h));
	}
	
}





public class InterfaceExample1 {

	public static void main(String[] args) {
	    circle c1 = new circle(15,42);
	    c1.area();
	    c1.volume();
	    
	    cylinder c2 = new cylinder(1,4);
	    c2.area();
	    c2.volume();
	}

}


