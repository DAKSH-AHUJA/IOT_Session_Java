package day1;

public class Fibonacci {

    
    public static long fib(int n) {
        if (n < 0) throw new IllegalArgumentException("n must be >= 0");
        if (n == 0) return 0;
        if (n == 1) return 1;

        long prev = 0; // fib(0)
        long curr = 1; // fib(1)

        for (int i = 2; i <= n; i++) {
            long next = prev + curr;
            prev = curr;
            curr = next;
        }
        return curr;
    }

   
    public static void printFibonacci(int count) {
        if (count < 0) throw new IllegalArgumentException("count must be >= 0");

        long prev = 0;
        long curr = 1;

        for (int i = 0; i < count; i++) {
            System.out.print(prev);
            if (i < count - 1) System.out.print(", ");

            long next = prev + curr;
            prev = curr;
            curr = next;
        }
        System.out.println();
    }

    
    public static void main(String[] args) {
        System.out.println("fib(10) = " + fib(10));      
        printFibonacci(10);                              
    }
}
