package Akshayjava.com;

import java.util.Arrays;

public class stream {

	private static boolean matches;


	public static void main(String[] args) {
		
		
		sop(isUppercase("PRANIL"));
		
		
	}

	private static boolean isUppercase(String string) {
		char[] charArray = string.toCharArray();
		
		for (char c : charArray) {
			if(string.valueOf(c).matches("[A-Z]")) {
				continue;
			}
			else
			return false;
		}
		return true;
//		try {
//			if(isUppercase(string))
//				return true;
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return false;
		
	}

	private static <T>void sop(T object) {
		System.out.println(object);
		
	}

}
