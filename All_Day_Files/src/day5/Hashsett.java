package day5;
import java.util.HashSet;

public class Hashsett {
	    public static void main(String[] args) {
	        HashSet<String> names = new HashSet<>();

	        names.add("John");
	        names.add("Mary");
	        names.add("John"); // Duplicate; will not be added

	        System.out.println(names);
	        System.out.println("Size: " + names.size());

	        if (names.contains("Mary")) {
	            System.out.println("Mary is present");
	        }
	    }
	}

