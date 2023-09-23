package Akshayjava.com;
import java.util.*;
public class Bubblesort {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a[] = {32,12,21,1,45,76};
		
		int l = a.length;
		
		int temp;
		
		for(int i=0;i<l-1;i++)
		{
			for(int j=0;j<l-1;j++)
			{
				if(a[i] < a[j]) {
					
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("sorted array is:");
		for(int j=0;j<l-1;j++) {
			System.out.println(a[j]);
		}

	}

}
