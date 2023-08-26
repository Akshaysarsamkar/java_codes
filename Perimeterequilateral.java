package Akshayjava.com;

import java.util.Scanner;

public class Perimeterequilateral {

	public static void main(String[] args) {
		
         Scanner sc = new Scanner(System.in);
		
		int radius;
		
		System.out.println("Enter the side of the Equilateral Tangle:");
		
		radius = sc.nextInt();
		
		int  per = 3 * radius;
		
		System.out.println(" Perimeter of the Equilateral Tangle is:"+per);

	}

}
