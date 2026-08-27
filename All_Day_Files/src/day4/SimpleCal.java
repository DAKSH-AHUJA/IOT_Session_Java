package day4;

import java.util.Scanner;

public class SimpleCal {

    static int add(int a, int b) {
        return a + b;
    }

    static int sub(int a, int b) {
        return a - b;
    }

    static int div(int a, int b) {
        return a / b;
    }

    static int mul(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. Addition");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter two numbers to add:");
                    int a = sc.nextInt();
                    int b = sc.nextInt();
                    System.out.println("Addition is: " + add(a, b));
                    break;

                case 2:
                    System.out.println("Enter two numbers to subtract:");
                    int c = sc.nextInt();
                    int d = sc.nextInt();
                    System.out.println("Subtraction is: " + sub(c, d));
                    break;

                case 3:
                    System.out.println("Enter two numbers to multiply:");
                    int e = sc.nextInt();
                    int f = sc.nextInt();
                    System.out.println("Multiplication is: " + mul(e, f));
                    break;

                case 4:
                    System.out.println("Enter two numbers to divide:");
                    int g = sc.nextInt();
                    int h = sc.nextInt();
                    if (h != 0) {
                        System.out.println("Division is: " + div(g, h));
                    } else {
                        System.out.println("Cannot divide by zero.");
                    }
                    break;

                default:
                    System.out.println("Invalid input");
                    break;
            }
        }
    }
}
