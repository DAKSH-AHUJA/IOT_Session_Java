package day1;

public class Palindrome {

    public static boolean isPalindrome(String s) {
        if (s == null) return false;

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            char cLeft = s.charAt(left);
            char cRight = s.charAt(right);

            if (!Character.isLetterOrDigit(cLeft)) {
                left++;
                continue;
            }
            if (!Character.isLetterOrDigit(cRight)) {
                right--;
                continue;
            }

            if (Character.toLowerCase(cLeft) != Character.toLowerCase(cRight)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

 
    public static void main(String[] args) {
        System.out.println(isPalindrome("racecar"));     
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("hello"));        
    }
}
