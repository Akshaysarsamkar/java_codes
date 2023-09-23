package Akshayjava.com;

import java.util.Scanner;

public class Discountcal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
      
		System.out.println("Enter the List prize:");
	    int lprize = sc.nextInt();
	    
	    
	    
	    final int dis = 98;
	    
	    float res = ((lprize * dis )/ 100);
	    
	    System.out.println("total discount is:"+res);
	    System.out.println("prize is:"+(lprize - res));
	}

}
