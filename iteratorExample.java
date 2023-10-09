package akshay.com;

import java.util.ArrayList;
import java.util.Iterator;

public class iteratorExample {
	public static void main(String[] args) {
	
		ArrayList<Integer> li = new ArrayList<Integer>();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		li.add(50);
		li.add(60);
		
		
		Iterator<Integer> e  = li.iterator();
		e.next();
		e.remove();
		while(e.hasNext()) {
			System.out.println(e.next());
		}
	}

}
