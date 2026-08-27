package day2;
import java.util.Scanner;
public class AddingMultipleNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	     System.out.println("Enter a number 1: ");
	     int n1 = sc.nextInt();
		
	     System.out.println("Enter a number 2: ");
	     int n2 = sc.nextInt();
	     
	     System.out.println("Enter a number 3: ");
	     int n3 = sc.nextInt();
	     
	     System.out.println("Enter a number 4: ");
	     int n4 = sc.nextInt();
	     
	     System.out.println("Enter a number 5: ");
	     int n5 = sc.nextInt();
	     
	     System.out.println("Sum of all number is " + +(n1+n2+n3+n4+n5));
	     sc.close();
	}
}
