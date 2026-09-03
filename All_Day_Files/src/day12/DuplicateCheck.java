package day12;

import java.util.HashSet;

public class DuplicateCheck {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 1, 4,5,  3, 2};

        HashSet<Integer> numbers = new HashSet<>();
        boolean hasDuplicate = false;

        for (int number : array) {
            if (!numbers.add(number)) {
                hasDuplicate = true;
                System.out.println("Duplicate found: " + number);
            }
        }

        if (!hasDuplicate) {
            System.out.println("No duplicates found");
        }
    }
}
