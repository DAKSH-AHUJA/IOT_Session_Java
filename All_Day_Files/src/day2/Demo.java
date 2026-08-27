
package day2;

//This file contains the method overloading and method overriding


//Method Overriding	
//this is class
class Parent
{
	
	void property() {
		System.out.println("Property");
	}
	void  marry() {
		System.out.println("Family selected girl");
	}
	
}




//Method overloading by extending the class
public class Demo extends Parent{
	void marry() {
		System.out.println("Child selected girl");
	}
	void property() {
		System.out.println("No Property");
	}


	// Method
	void m1() {
		System.out.println("Method 1");
	}
	
	// Method overloading
	void m1(int n) {
		System.out.println("Method 2");
	}
		
	public static void main(String[] args) {
		Demo test = new Demo();
		test.marry();
		test.property();
		
	}
}
