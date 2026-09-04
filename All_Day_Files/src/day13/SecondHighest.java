package day13;


public class SecondHighest {
    public static void main(String[] args) {

        int[] salary = {50000, 30000, 70000, 60000};

        int highest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int i = 0; i < salary.length; i++) {

            if (salary[i] > highest) {
                second = highest;
                highest = salary[i];
            }
            else if (salary[i] > second && salary[i] != highest) {
                second = salary[i];
            }
        }

        System.out.println("Second highest salary: " + second);
    }
}