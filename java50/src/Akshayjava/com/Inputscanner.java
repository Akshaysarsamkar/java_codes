package Akshayjava.com;
import java.util.*;
public class Inputscanner {

	public static void main(String[] args) {
		
		Scanner sc =new  Scanner(System.in);
		System.out.println("Entert the number:");
		int i = sc.nextInt();
		int i1 = sc.nextInt();
		int i2 = sc.nextInt();
		int i3 = sc.nextInt();
		int i4 = sc.nextInt();
		
		int sum = i + i1+i2+i3+i4;
		
		System.out.println("Avg is:"+sum/5);
		
	}

}
