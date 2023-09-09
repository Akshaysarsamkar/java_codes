package Aksahyopps.com;

public class ParameterizesCon{
	
	//parametrizes constsructor
	ParameterizesCon(String name){
		System.out.println("hello "+name);
	}
	
	
	public static void main(String[] args) {
		ParameterizesCon h1 = new ParameterizesCon("Akshay");
		ParameterizesCon h2 = new ParameterizesCon("connection");
		ParameterizesCon h3 = new ParameterizesCon("other");
	}

}
