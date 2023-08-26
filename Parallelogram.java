package Akshayjava.com;

import java.util.Scanner;

public class Parallelogram {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the base :");
		
		int base = sc.nextInt();
		
		System.out.println("Enter the length:");
		
		int hei = sc.nextInt();
		
		int  area =base * hei ;
		
	    System.out.print("Area of Parallelogram is:"+area);

	}

}
