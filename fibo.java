package Akshayjava.com;

import java.util.Scanner;

public class fibo {

	public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the size of series:");
			
			int size = sc.nextInt();
			
			int f1 = 0;
			int f2 = 1;
			
			System.out.println("Series is: "+f1+" "+f2+" " );
			
			for(int i=0;i<size-2;i++)
			{
				int f3 = f1 + f2;
				System.out.println(f3 + " ");
				f1 = f2;
				f2=f3;
			}

	}

}
