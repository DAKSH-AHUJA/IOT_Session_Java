package day5;

public class Task {
    public static void main(String[] args) {
        String s1 = "ABC";

        // First loop starts from the front
        for (int i = 0; i < s1.length(); i++) {
            for (int j = i + 1; j <= s1.length(); j++) {
                String substring = s1.substring(i, j);
                System.out.println(substring);
            }
        }
    }
}
