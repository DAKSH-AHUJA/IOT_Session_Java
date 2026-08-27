package day1;

import java.util.Scanner;

public class factorial {
    public static long Factorial(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Factorial of " + n + " = " + Factorial(n));

        sc.close();
    }
}
