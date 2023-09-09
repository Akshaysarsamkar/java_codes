package Aksahyopps.com;
/*
 Q1:What is constructor?
   -: Constructor is Special Member function of the class.
   -: Constructor is used for initialization 
   -: it has same name as a class
   -: constructor can not have return type
   -: it invoke implicitly.
   -: we can create multiple constructor in one class.
   -: their are 3 different type  of the Constructor
       1] default constructor
       2] Parameterizes constructor
       3] Overloading constructor 
   -: Syntax
         constructor_name(){
            //body of constructor
          }
            
       Let discuss about the Default constructor
        1]default constructor:
        -:the constructor without parameter is called as default constructor
        -:we can create only one default constructor in one class
        -:it is invoked implicitly
        
        --->  let try to illustrate constructor
*/

public class DefaultConstructorEx {
	
	
	DefaultConstructorEx() 
	{
		System.out.println("i am constructor");
		
	}
	public static void main(String[] args){
		//object
		//invoke implicitly
		 DefaultConstructorEx obj = new  DefaultConstructorEx();
	}
}
