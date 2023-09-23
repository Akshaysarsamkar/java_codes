package Aksahyopps.com;

class animal{
	void eat()
	{
		System.out.println("Eating.....");
	}
}

class Dog extends animal
{
	void eat() {
		System.out.println("eating bread....");
		
	}
	
	void bark() {
		System.out.println("barking.......");
	}
	
	void work() {
		super.eat();
		bark();
	}
}


public class Testsuper1 {

	public static void main(String[] args) {
		
		Dog d = new Dog();
		d.work();

	}

}
