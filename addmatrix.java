package Akshayjava.com;
import java.util.*;
public class addmatrix {

	public static Scanner sc = new Scanner(System.in);
	void showArrayElement(int[][] array) {
		  for(int i = 0;i<array.length;i++)
		  {
			  for(int j=0;j<array[0].length;j++)
			  {
				 System.out.print(a[i][j]+" ");
			  }
			  System.out.println();
		  }
	}
	
	public void getArrayElement(int[][] array){
                for(int i = 0;i<array.length;i++)
		  {
			  for(int j=0;j<array[0].length;j++)
			  {
                               array[i][j]=sc.nextInt();
			  }
		  }
	}
	public void getMatrixAddition(int[][] array1,int[][] array2,int[][] sumMatrix){
                for(int i = 0;i<sumMatrix.length;i++)
		  {
			  for(int j=0;j<sumMatrix[0].length;j++)
			  {
                               sumMatrix[i][j] = array1[i][j] + array2[i][j];
			  }
		  }
	}

	public static void main(String[] args) {
	
	  int a1[][]	= new int[2][3];
	  int a2[][] = new int[2][3];
	  int sum[][] = new int[2][3];

          addmatrix a = new addmatrix();
		
	  //first array
	  System.out.println("Enter the first array element:");
	  a.getArrayElement(a1);

          //second array
	  System.out.println("Enter the first array element:");
	  a.getArrayElement(a2);
	  
	 
		
	  addmatrix a = new addmatrix();
	  System.out.println("first array matix is:");
	  a.showArrayElement(a1);
	  
	  System.out.println("first array matix is:");
	  a.showArrayElement(a2);
	  
	  // add matrix a1 and a2
	  a.getMatrixAddition(a1,a2,sum);
	  	
	  System.out.println("Sum of matrix:");
	  a.showArrayElement(sum);
	  
	}

}
