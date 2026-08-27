package day3;

public class Demo2 {
	public static void main(String[] args) {
		System.out.println("daksh");
		//int a = 10/0; // this line will get error and execution will stop
		try {
			System.out.println("abcd");
		} finally{
			System.out.println("finally block");
		}
	}
}
