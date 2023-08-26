package Akshayjava.com;

import java.util.Scanner;

public class VolumnCyc {

	public static void main(String[] args) {
	
        Scanner sc = new Scanner(System.in);
		
		int radius;
		
		System.out.println("Enter the radius of the circle:");
		
		radius = sc.nextInt();
		
        System.out.println("Enter the radius of the circle:");
		
		int h = sc.nextInt();
		
		final float pi = 3.14f;
		
		float Area = pi * radius * radius * h;
		
		System.out.println("cyc volume is:"+Area);

	}

}
