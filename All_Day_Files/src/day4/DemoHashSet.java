package day4;


import java.util.HashSet;

public class DemoHashSet {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};
        int target = 40;

        HashSet<Integer> set = new HashSet<>();

        for (int n : numbers) {
            set.add(n);
        }

        if (set.contains(target)) {
            System.out.println("Number found");
        } else {
            System.out.println("Number not found");
        }
    }
}
