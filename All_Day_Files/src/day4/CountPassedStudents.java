package day4;

public class CountPassedStudents {
    public static void main(String[] args) {
        int[] marks = {35, 67, 89, 22, 45, 30, 76};

        int passedCount = 0;
        
        for (int mark : marks) {
            if (mark >= 40) {
                passedCount++;
            }
        }
        System.out.println("Passed students: " + passedCount);
    }
}
