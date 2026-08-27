package day7;
public class Stack {
	static void methodA() {
		System.out.println("Inside methodA");
		Object methodB;
		System.out.println("Back to methodA");
	}
	static void methodB() {
		Object methodC;
		System.out.println("Inside methodB");
	}
	static void methodC() {
		System.out.println("Inside methodC");
	}
	public static void main(String[]args) {
		System.out.println("Inside main");
		System.out.println("Back to main");
	}
}