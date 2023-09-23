package Akshayjava.com;
import java.io.*;
public class inputbuff {

	public static void main(String[] args) throws Exception {
		 BufferedReader b = new  BufferedReader(new InputStreamReader(System.in));
		 System.out.println("Enter the number");
		 int num = Integer.parseInt(b.readLine());
		 System.out.println("number is:"+num);
	}
}
