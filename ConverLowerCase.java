package Akshayjava.com;
import java.util.*;
public class ConverLowerCase {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("ENTER THE STRING:");
		String str = sc.nextLine();
		
		System.out.println(str.toLowerCase());
		
		String rep = str.replace(" ","_");
		
		System.out.println(rep);
	}

}
