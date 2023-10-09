package inheritance.com;

class Addition{
	void add(int a,int b) {
		System.out.println("addtion is:"+(a+b));
	}
	
	void add(int a,float b) {
		System.out.println("addition is:"+(a+b));
	}
}

public class MethodOverlodingEx{

	public static void main(String[] args) {
		Addition a = new Addition();
		a.add(12,43);
		a.add(12,43.5f);
	}

}
