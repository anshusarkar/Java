package Abstractclass;
// Abstract class
abstract class Sunstar {		// abstract class are just used for keeping function calls in a an class 
	abstract void printInfo();
}

// Abstraction performed using extends
class Abstractclass extends Sunstar {
	void printInfo()
	{
		String name = "avinash";
		int age = 21;
		float salary = 222.2F;

		System.out.println(name);
		System.out.println(age);
		System.out.println(salary);
	}
}

// Base class
class Base {
	public static void main(String args[])
	{
		Sunstar s = new  Abstractclass(); // Though while creating class instance the class in which the method is called shuld be there after new key word !
		s.printInfo();
	}
}
