package day6;

public class ArrayMergedNames {
    public static void main(String[] args) {

        String[] array1 = {"John", "Emma", "Michael"};
        String[] array2 = {"Sophia", "David", "Olivia"};

        String[] merged = new String[array1.length + array2.length];

        for (int i = 0; i < array1.length; i++) {
            merged[i] = array1[i];
        }

        for (int i = 0; i < array2.length; i++) {
            merged[array1.length + i] = array2[i];
        }

        System.out.println("Merged array:");

        for (int i = 0; i < merged.length; i++) {
            System.out.println(merged[i]);
        }
    }
}
