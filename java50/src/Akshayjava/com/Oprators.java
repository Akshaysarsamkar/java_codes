package Akshayjava.com;
import java.util.*;

public class Oprators {
	
	void Arithmatic() {
		
		Scanner sc = new Scanner(System.in);
		
		int num1,num2;
		
		System.out.print("Enter the 2 number:");
		
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		System.out.println("Addition is:"+ (num1 + num2));
		System.out.println("Subtraction is:"+ (num1 - num2));
		System.out.println("Multipication is:"+ (num1 * num2));
		System.out.println("Division is:"+ (num1 / num2));
		System.out.println("Modular is:"+ (num1 % num2));
	}
	
void logical() {
		
		Scanner sc = new Scanner(System.in);
		
		int num1,num2;
		
		System.out.print("Enter the 2 number:");
		
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		if(num1 == 10 || num2 == 20 )
			System.out.println("OR Operator used mean one condition is true");
		else
			System.out.println("both condition in or flase");
		
		
		if(num1 == 10 && num2 == 20 )
			System.out.println("And Operator used mean Both condition is true");
		else
			System.out.println("both condition in And is flase");
		
		if(num2 == 20 )
			System.out.println("not operator");
			
	}
	
	

void camparison() {
	
	Scanner sc = new Scanner(System.in);
	
	int num1,num2;
	
	System.out.print("Enter the 2 number:");
	
	num1 = sc.nextInt();
	num2 = sc.nextInt();
	
	if(num1 > num2 )
		System.out.println("> operator");
	
	if(num1 == num2 )
	 System.out.println("== operator");
	
	if(num2 < 20 )
		System.out.println("< operator");
		
	if(num2 >= 10 )
		System.out.println(">= operator");
	
	if(num1 <= 20 )
		System.out.println("<= operator");
	
	if(num2 != 20 )
		System.out.println("!= operator");
}





	public static void main(String[] args) {
		
		Oprators op = new Oprators();

		op.Arithmatic();
		System.out.println();
		
		
		System.out.println("Logical operator:");
		op.logical();
		
		System.out.println();
		System.out.println("camparison operator:");
		op.camparison();
	}

}
