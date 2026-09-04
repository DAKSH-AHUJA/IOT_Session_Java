package day13;

public class EmployeeId {
    public static void main(String[] args) {

        int[] ids = {101, 102, 101, 103, 101};
        int search = 101;

        int count = 0;

        for (int i = 0; i < ids.length; i++) {
            if (ids[i] == search) {
                count++;
            }
        }

        System.out.println("Employee ID appears: " + count + " times");
    }
}