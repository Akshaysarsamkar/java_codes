package Akshayjava.com;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadContent {

	public static String path = "C:\\Users\\bca 2023\\eclipse-workspace\\java50\\src\\Akshayjava\\com\\text.txt";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int c = 0, w = 0, l = 0;
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(path));
			String readLine = reader.readLine();
			while (readLine.isEmpty()) {
				++l;
				sop(readLine);
				readLine = reader.readLine();
				try {
					char[] charArray = readLine.toCharArray();
					for (char d : charArray) {
						c++;
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				String[] wordArray = readLine.split(" ");
				w = wordArray.length;

			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static <T> void sop(T object) {
		System.out.println(object);

	}

}
