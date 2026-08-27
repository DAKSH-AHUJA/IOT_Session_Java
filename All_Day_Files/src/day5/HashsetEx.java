package day5;

import java.util.HashSet;

public class HashsetEx {
    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();

        System.out.println("Initial size before adding elements: " + set.size());
        System.out.println("Is HashSet empty before adding values: " + set.isEmpty());
        System.out.println("Contents before adding values: " + set);

        set.add("C");
        set.add("A");
        set.add("E");
        set.add("B");
        set.add("D");
        set.add("F");

        // HashSet allows one null value
        set.add(null);

        System.out.println("Size after adding elements: " + set.size());
        System.out.println("Is HashSet empty after adding values: " + set.isEmpty());
        System.out.println("Contents after adding values: " + set);

        boolean b1 = set.contains("E");
        System.out.println("Value E is present: " + b1);

        boolean b2 = set.contains("R");
        System.out.println("Value R is present: " + b2);

        set.remove("B");

        System.out.println("Size after deletion: " + set.size());
        System.out.println("Contents after deletion: " + set);

        set.clear();

        System.out.println("Size after clearing: " + set.size());
        System.out.println("Contents after clearing: " + set);
    }
}

