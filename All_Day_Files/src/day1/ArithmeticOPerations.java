package day1;

import java.util.Scanner;

public class ArithmeticOPerations {

    public static int add(int a, int b) {
        return a + b;
    }
    
    public static int sub(int a, int b) {
    	return a - b;
    }
    
    public static int mul(int a, int b) {
    	return a * b; 
    }
    
    public static int div(int a, int b) {
    	return a/b ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int sum = add(a, b);
        System.out.println("Sum = " + sum);
        
        int sub = sub(a, b);
        System.out.println("Subtraction = " + sub);
        
        int mul = mul(a, b);
        System.out.println("Multiplication = " + mul);
        
        int div = div(a, b);
        System.out.println("Dividation = " + div);

        sc.close();
    }
}


