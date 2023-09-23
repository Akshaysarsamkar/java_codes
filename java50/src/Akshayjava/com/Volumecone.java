package Akshayjava.com;

import java.util.Scanner;

public class Volumecone {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
		
		int radius;
		
		System.out.println("Enter the radius of the circle:");
		
		radius = sc.nextInt();
		
		final float pi = 3.14f;
		
		float Area = pi * radius * radius * (4/3);
		
		System.out.println("Circle Perimeter is:"+Area);

	}

}
