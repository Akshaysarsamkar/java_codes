package Akshayjava.com;
import java.util.*;
public class reverseorder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		  int a1[]	= new int[5];
		 System.out.println("enter array element:");
		  for(int i =0;i<5;i++)
		  {
			 a1[i] = sc.nextInt();
		  }
		  System.out.println("before reverse:");
		  for(int i=0;i<5;i++)
			System.out.print(a1[i]+"  ");
		  
		  System.out.println();
		  System.out.println("After reverse:");
		  
		  for(int i=5-1;i>=0;i--)
		  {
			System.out.print(a1[i]+"  ");
		  }
	}

}
