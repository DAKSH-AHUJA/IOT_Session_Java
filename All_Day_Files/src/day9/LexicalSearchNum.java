package day9;

import java.util.ArrayList;

public class LexicalSearchNum {
    public static void main(String[] args) {
        String[] phoneNumbers = {
                "9876543210",
                "9123456780",
                "9988776655",
                "9876501234",
                "9001122334"
        };

        String search = "987";

        ArrayList<String> result = new ArrayList<>();

        for (String phoneNumber : phoneNumbers) {
            if (phoneNumber.contains(search)) {
                result.add(phoneNumber);
            }
        }

        System.out.println("Search results");

        for (String phoneNumber : result) {
            System.out.println(phoneNumber);
        }
    }
}
