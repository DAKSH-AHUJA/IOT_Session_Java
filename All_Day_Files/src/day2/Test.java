package day2;


//this code is to understand encapsulation basics 


public class Test {
/*
	int a = 20; // instance variable
	int b = 10;
	
	void m1(int a, int b) {                        //local variable
		System.out.println(a+b);     
		System.out.println(this.a+this.b);   // this keyword means that the instance variable will be used not the parameter variable also we can say it will use the current class variable 
	}
*/
	
	
	int a;
	int b;
	
	void m1(int c, int d) {
		a = c;
		b = d;
	}
	void m2() {
		System.out.println(a+b);
	}
	
	
	
	public static void main(String[] args) {
		Test obj = new Test();
		obj.m1(5, 6);
		obj.m2();
	}
	
}
