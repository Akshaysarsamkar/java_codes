package Akshayjava.com;
import java.util.*;
public class addmatrix {
	
	void display(int a[][]) {
		
		for(int i = 0;i<2;i++)
		  {
			  for(int j=0;j<3;j++)
			  {
				 System.out.print(a[i][j]+" ");
			  }
			  System.out.println();
		  }
	}

	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
		
	  int a1[][]	= new int[2][3];
	  int a2[][] = new int[2][3];
	  int sum[][] = new int[2][3];
	  
	  //first array
	  System.out.println("Enter the first array element:");
	  for(int i = 0;i<2;i++)
	  {
		  for(int j=0;j<3;j++)
		  {
			  a1[i][j] = sc.nextInt();
		  }
	  }
		
	  System.out.println("Enter the first array element:");
	  //second array
	  for(int i = 0;i<2;i++)
	  {
		  for(int j=0;j<3;j++)
		  {
			  a2[i][j] = sc.nextInt();
		  }
	  }
		
	  addmatrix a = new addmatrix();
	  System.out.println("first array matix is:");
	  a.display(a1);
	  
	  System.out.println("first array matix is:");
	  a.display(a2);
	  
	  for(int i = 0;i<2;i++)
	  {
		  for(int j=0;j<3;j++)
		  {
			  sum[i][j]=a1[i][j] + a2[i][j];
		  }
	  }
		
	  System.out.println("Sum of matrix:");
	  a.display(sum);
	  
	}

}
