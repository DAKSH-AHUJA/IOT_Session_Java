package day7;

public class RecurConceptWithIteration {

    public static void main(String[] args) {

        int balance = 10000;

        for (int i = balance; i > 0; i -= 2000) {
            System.out.println("Withdrawing ₹2000");
            System.out.println("Remaining balance: $" + (i - 2000));
        }
    }
}
