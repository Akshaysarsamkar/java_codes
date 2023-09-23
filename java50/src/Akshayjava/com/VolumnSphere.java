package Akshayjava.com;

import java.util.Scanner;

public class VolumnSphere {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		int radius;
		
		System.out.println("Enter the radius of the circle:");
		
		radius = sc.nextInt();
		
		final float pi = 3.14f;
		
		float Area =   (4/3) * pi * radius * radius;
		
		System.out.println("Circle Perimeter is:"+Area);
	}

}
