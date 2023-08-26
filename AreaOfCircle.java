package Akshayjava.com;
import java.util.*;
public class AreaOfCircle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int radius;
		
		System.out.println("Enter the radius of the circle:");
		
		radius = sc.nextInt();
		
		final float pi = 3.14f;
		
		float Area = 2 * pi * radius * radius;
		
		System.out.println("Area of the circle is:"+Area);
	}

}
