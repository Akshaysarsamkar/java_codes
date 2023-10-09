package Inheritanceporgram;

//Define a class MyNumber having one private integer data
//member. Write a default constructor initialize it to 0 and
//another constructor to initialize it to a value. Write methods
//isNegative, isPositive, isOdd, iseven. Use command line
//argument to pass a value to the object and perform the above
//tests.
//




public class Quation7 {

	public static void main(String[] args) {
		
		Mynumber m1 = new Mynumber();
		System.out.println("number is");
		m1.check();
		
		System.out.println();
		Mynumber m2 = new Mynumber(78);
		System.out.println("78 number is number is");
		m2.check();
		

	}

}
