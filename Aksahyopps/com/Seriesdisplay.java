package Aksahyopps.com;

import java.util.Scanner;

//Create a package named “Series” having three different
//classes to print series: 
//a. Fibonacci series 
//b. Cube of numbers 
//c. Square of numbers 
//Write a java program to generate “n” terms of the above series. 
//Accpet n from user

class Fibonacchi{
	int n;
	
	public Fibonacchi(int n) {
		this.n = n;
	}
	
	void display(){
		int f1=0;
		int f2=1;
		System.out.print("Fibonachi series is: ");
		System.out.print(f1+ " "+f2+ " ");
		for(int i=0;i<n-2;i++) {
			int f3 = f1 + f2;
			System.out.print(f3+" ");
			f1=f2;
			f2=f3;
		}
	}
	
}

class Cube{
	int n;
	Cube(int n){
		this.n = n;	
	}
	void display(){
		for(int i=1;i<n;i++) {
			System.out.println("Cube of " + i  + " Element is: " +(i*i*i));
		}
	}
}

class Square{
	int n;
	Square(int n){
		this.n = n;	
	}
	void display(){
		for(int i=1;i<n;i++) {
			System.out.println("Square of " + i  + " Element is: " +(i*i));
		}
	}
}




public class Seriesdisplay {

	public static void main(String[] args) {
		
		int ch,n,i=0;
		Scanner sc = new Scanner(System.in);
		
		while(i==0) {
		
		System.out.println("Enter your choice");
		System.out.println("1:Fibonacci series");
		System.out.println("2:Cube");
		System.out.println("3:Square");
	    ch = sc.nextInt();
		switch(ch) {
		case 1:
			System.out.println("Enter the number");
			n = sc.nextInt();
			Fibonacchi f1 = new Fibonacchi(n);
			f1.display();
			break;
			
		case 2:
			System.out.println("Enter the number");
			n = sc.nextInt();
			Cube c1 = new Cube(n);
			c1.display();
			break;
			
		case 3:
			System.out.println("Enter the number");
			n = sc.nextInt();
			Square s1 = new Square(n);
			s1.display();
			break;
			
	    default:
	    	System.out.println("wrong input");
		}
		System.out.println();
		System.out.println("do you want to run again");
		i = sc.nextInt();
	 }
		System.out.println("program Ended!!!!!!!!!!!!");
	}

	
}
