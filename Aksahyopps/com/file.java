package Aksahyopps.com;

import java.io.File;
import java.io.IOException;

public class file {

	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\50 java progamming","abc.csv");

		if(f.createNewFile()) {
			System.out.println("created");
		}
		else {
			System.out.println("not created");
		}
		
		System.out.println();
	}

}
