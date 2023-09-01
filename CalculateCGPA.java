package Akshayjava.com;
import java.util.*;

public class CalculateCGPA {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int m1,m2,m3,m4;
		
		System.out.println("Enter the mark1:");
        m1 = sc.nextInt();
        
        System.out.println("Enter the mark1:");
        m2 = sc.nextInt();
        
        System.out.println("Enter the mark1:");
        m3 = sc.nextInt();
        
        System.out.println("Enter the mark1:");
        m4 = sc.nextInt();
        
        float per = (m1+m2+m3+m4)/4;
       
        float cgpa = (float) (per / 9.5);
        
        System.out.println(cgpa);
	}

}
