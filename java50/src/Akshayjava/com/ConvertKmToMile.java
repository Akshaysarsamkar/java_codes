package Akshayjava.com;
import java.util.*;
public class ConvertKmToMile {

	public static void main(String[] args) {
		// kilometer / 1.609344
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the total kilometer:");
		
		int km = sc.nextInt();
	
		final float m = 1.609344f;
		
		float mile = km / m;
		
		System.out.println("total miles is:"+mile);
	
	}

}
