package day6;

public class NewLogicExpenses {
    public static void main(String[] args) {

        int[] marks = {75, 82, 68, 90, 88};
        int windowSize = 3;

        int windowSum = 0;
        int highestSum = 0;
        for (int i = 0; i < windowSize; i++) {
            windowSum += marks[i];
        }

        highestSum = windowSum;

        for (int i = windowSize; i < marks.length; i++) {
            windowSum += marks[i] - marks[i - windowSize];

            if (windowSum > highestSum) {
                highestSum = windowSum;
            }
        }

        System.out.println("Highest marks sum = " + highestSum);
    }
}
