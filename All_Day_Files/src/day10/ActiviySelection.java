package day10;
import java.util.Arrays;
import java.util.Comparator;

public class ActiviySelection {

    public static void main(String[] args) {

        int[] arrival = {9, 9, 10, 10, 11};
        int[] departure = {10, 11, 10, 11, 12};

        Integer[] activities = {0, 1, 2, 3, 4};

        // Sort activities by departure time
        Arrays.sort(activities, Comparator.comparingInt(i -> departure[i]));

        int lastDeparture = -1;

        System.out.println("Selected Activities:");

        for (int i : activities) {

            if (arrival[i] >= lastDeparture) {
                System.out.println(
                    "Activity " + (char) ('A' + i) +
                    " : " + arrival[i] + " - " + departure[i]
                );

                lastDeparture = departure[i];
            }
        }
    }
}
