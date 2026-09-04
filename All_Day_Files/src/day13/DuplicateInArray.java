package day13;

public class DuplicateInArray {

    static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int uniqueIndex = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[uniqueIndex - 1]) {
                nums[uniqueIndex] = nums[i];
                uniqueIndex++;
            }
        }
        return uniqueIndex;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3};

        int k = removeDuplicates(nums);

        System.out.println("Unique elements: " + k);

        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
