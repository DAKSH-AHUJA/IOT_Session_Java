package day5;

public class Dublicate {
    public static void main(String[] args) {
        String s1 = "PROGRAMMING";

        System.out.println("Duplicate characters:");

        for (int i = 0; i < s1.length(); i++) {
            boolean alreadyPrinted = false;

            for (int k = 0; k < i; k++) {
                if (s1.charAt(i) == s1.charAt(k)) {
                    alreadyPrinted = true;
                    break;
                }
            }
            if (alreadyPrinted) {
                continue;
            }
            for (int j = i + 1; j < s1.length(); j++) {
                if (s1.charAt(i) == s1.charAt(j)) {
                    System.out.println(s1.charAt(i));
                    break;
                }
            }
        }
    }
}
