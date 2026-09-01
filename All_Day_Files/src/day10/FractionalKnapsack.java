package day10;

public class FractionalKnapsack {

    public static void main(String[] args) {

        int capacity = 10;

        String[] item = {"A", "B", "C"};
        int[] weight = {5, 10, 4};
        int[] profit = {100, 120, 80};

        // Items arranged by profit per kg:
        // A = 20, C = 20, B = 12

        double totalProfit = 0;

        // Take item A
        if (capacity >= weight[0]) {
            capacity -= weight[0];
            totalProfit += profit[0];
            System.out.println("Taken A: 5 kg");
        }

        // Take item C
        if (capacity >= weight[2]) {
            capacity -= weight[2];
            totalProfit += profit[2];
            System.out.println("Taken C: 4 kg");
        }

        // Take the remaining fraction of item B
        if (capacity > 0) {
            double fraction = (double) capacity / weight[1];
            totalProfit += profit[1] * fraction;

            System.out.println("Taken B: " + capacity + " kg");
        }

        System.out.println("Maximum Profit: " + totalProfit);
    }
}
