package day3;
import java.util.Scanner;
public class Test {
	static void validate(int age) {
		
		if (age < 18 ) {
			throw new ArithmeticException("not Eligible for vote");
		}else {
			System.out.println("Welcome to board");
		}
	}
	
	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Please enter ur age");
			int n = sc.nextInt();
			validate(n);
			System.out.println("rest of the code"); 
			sc.close();
		}
}

