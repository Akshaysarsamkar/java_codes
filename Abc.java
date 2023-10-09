package inheritance.com;
class xyz{
	int a = 100;
}


public class Abc extends xyz{

	    int y = 200;
	    public static void  main(String args[])
	    {
	    	Abc a = new Abc();
	    	System.out.println(a.a);
	    	System.out.println(a.y);
	    }
}
