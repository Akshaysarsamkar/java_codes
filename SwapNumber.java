package Akshayjava.com;
import java.util.*;
public class SwapNumber {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first number:");
		int num1 = sc.nextInt();
		
		System.out.println("Enter the second number:");
		int num2 =sc.nextInt();
		
		System.out.println("value of num1:"+num1 +" num2:"+num2);
		
		num1 = num1 + num2;
		
		num2 = num1 - num2;
		
		num1 = num1 - num2;
		
		System.out.println("value of num1:"+num1 +" num2:"+num2);
	}
}