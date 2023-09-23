package Akshayjava.com;

import java.util.Scanner;

public class Areaofractangle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the base :");
		
		int base = sc.nextInt();
		
		System.out.println("Enter the length:");
		
		int hei = sc.nextInt();
		
		float area =base * hei / 2;
		
	    System.out.print("Area of Ractangle is:"+area);
	}

}
