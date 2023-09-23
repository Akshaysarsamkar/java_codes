package Aksahyopps.com;

/* =
 Q1:- What is class?
      1-class is collection of Object or blueprint of object
      2-class can not create  as private 
      3-When we create a class the first latter of class should be Capital 
      4-class is logical entity
 Q2:- how to create class
       -:Syntax:
        
        
 Q3:-what is object
    1:- Object is Instance of class.
    2:- Object is logical as well as physical entity 
    3:- we can create multiple object for one class
 Q4:how to create Object 
     -:syntax
         class_name object_name = new class_name();
     -: Bike b1 = new Bike();
 */

class Classobj {
	
	 void msg() {
		 System.out.println("hello i am method");
	 }

	public static void main(String[] args) {
		
		System.out.println("hello Connection");

		Classobj obj1  = new Classobj();
		obj1.msg();
		
		Classobj obj2  = new Classobj();
		obj1.msg();
		
		Classobj obj3  = new Classobj();
		obj1.msg();
	}

}
