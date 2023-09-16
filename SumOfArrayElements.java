package Aksahyopps.com;
import java.util.*;
public class SumOfArrayElements {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[10];
		
		System.out.println("Enter the Array element");
		
		for(int i =0;i<10;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		
		int sum =0;
		for(int ele : arr)
			sum +=ele;
		
		System.out.println("Sum of the array element is:"+sum);
		
	}
}
