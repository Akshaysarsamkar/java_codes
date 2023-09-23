package Aksahyopps.com;
//Write a Java program to print the sum of elements of the array.
//Also display array elements
//in ascending order.
import java.util.*;
public class sum {

	public static void main(String[] args) {
		
		int a[] = new int [10];
		Scanner sc = new Scanner(System.in);
	    System.out.println("enter the element");
	   for(int i=0;i<10;i++)
	   {
		    a[i] = sc.nextInt();
	   }
	   
	   int sum =0;
	   for(int i=0;i<10;i++)
	   {
		   sum += a[i];
	   }
	   System.out.println("sum all array element is:"+sum);
	}

}
