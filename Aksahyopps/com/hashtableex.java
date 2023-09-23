package Aksahyopps.com;
import java.util.*;
public class hashtableex {

	public static void main(String[] args) {
		
	Hashtable<String,Float>	 h1 = new Hashtable<String,Float>();
		
	h1.put("abih", 45.78f);
	h1.put("sam", 85.78f);
	h1.put("Sita", 25.78f);
	h1.put("ram", 35.78f);

		System.out.println(h1);
		System.out.println(h1.getClass());
		
		for(Map.Entry<String,Float> e : h1.entrySet()) {
			String name = e.getKey();
			Float f = e.getValue();
			System.out.println("name of student is:"+name+" percentage is:"+f);
		}
	}

}
