package day5;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExHashSet {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>();

        // Adding 10 values
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");
        set.add("E");
        set.add("A");     // Duplicate
        set.add("B");     // Duplicate
        set.add(null);    // Null value
        set.add("F");
        set.add(null);    // Duplicate null value

        System.out.println("HashSet values: " + set);
        System.out.println("HashSet size: " + set.size());

        System.out.println("\nIterating using enhanced for loop:");

        for (String value : set) {
            System.out.println(value);
        }

        System.out.println("\nIterating using Iterator:");

        Iterator<String> iterator = set.iterator();

        while (iterator.hasNext()) {
            String value = iterator.next();
            System.out.println(value);
        }
    }
}
