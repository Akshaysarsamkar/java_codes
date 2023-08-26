package Akshayjava.com;
import java.util.Scanner;
public class battingavg {

	public static void main(String[] args) {

		Scanner sc =new  Scanner(System.in);
		System.out.println("Entert the run:");
		int b = sc.nextInt();
		int b1 = sc.nextInt();
		int b2 = sc.nextInt();
		int b3 = sc.nextInt();
		int b4 = sc.nextInt();
		
		int sum = b + b1+b2+b3+b4;
		
		System.out.println("batting Avg is:"+sum/5);
		
	}

}
