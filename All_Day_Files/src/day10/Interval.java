package day10;

import java.util.*;

public class Interval {

    public static void main(String[] args) {
        String[] names = {"A", "B", "C", "D", "E"};
        int[][] intervals = {
            {900, 1000},
            {930, 1100},
            {1000, 1100},
            {1100, 1200},
            {1130, 1300}
        };

        int start = intervals[0][0];
        int end = intervals[0][1];
        String merged = names[0];

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] <= end) {
                end = Math.max(end, intervals[i][1]);
                merged += ", " + names[i];
            } else {
                System.out.println(merged + ": " + start + " - " + end);

                start = intervals[i][0];
                end = intervals[i][1];
                merged = names[i];
            }
        }

        System.out.println(merged + ": " + start + " - " + end);
    }
}
