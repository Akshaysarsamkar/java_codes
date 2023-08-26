package Akshayjava.com;

import java.util.Scanner;

public class EelBillcal {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter you unit:");
	int u = sc.nextInt();
	final int r = 10;
	System.out.println("Ele bill is:"+(u  * r) );
	}
}
