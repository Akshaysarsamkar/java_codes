package Akshayjava.com;

import java.util.Scanner;

public class PeremeterRactangle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int w,l;
		
		System.out.println("Enter the l:");
		
		l = sc.nextInt();
		
        System.out.println("Enter the w:");
		
		w = sc.nextInt();
		
		System.out.println("Perimeter Parallelogram is:"+ 2*(l+w));
		

	}

}
