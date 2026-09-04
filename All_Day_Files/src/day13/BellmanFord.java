package day13;


public class BellmanFord {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 5, 6};

        int n = 6;

        int total = n * (n + 1) / 2;

        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
        }

        int missing = total - sum;

        System.out.println("Missing number: " + missing);
    }
}