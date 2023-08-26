package Akshayjava.com;
import java.util.*;
public class PlindromeNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

       System.out.println("Enter the number:");
       
       int num = sc.nextInt();
       
       int rev = 0;
       int n = num;
       while(num > 0)
       {
    	   int rem = num % 10;
    	   rev = rev * 10 + rem;
    	   num = num /10;
       }
       
       if (rev == n)
       {
    	   System.out.println("palindrome");
       }
       else {
    	   System.out.println("not palindrome");
       }
	}

}
