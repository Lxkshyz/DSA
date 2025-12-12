package DataStructures.Arrays;

import java.util.*;

public class AppleOrange {
    public static void main(String[] args) {
        // sample input
        int s = 7;   // house start
        int t = 11;  // house end

        int a = 5;   // apple tree position
        int b = 15;  // orange tree position
        List<Integer> apples = Arrays.asList(-2, 2, 1);
        List<Integer> oranges = Arrays.asList(5, -6);
        countApplesAndOranges(s, t, a, b, apples, oranges);
    }
    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        int applesFell = 0;
        int orangesFell = 0;

        for (int i : apples) {
            int distance = a + i;
            if (distance >= s && distance <= t) {
                applesFell++;
            }
        }
        for (int i : oranges) {
            int distance = b + i;
            if (distance >= s && distance <= t) {
                orangesFell++;
            }
        }

        System.out.println(applesFell);
        System.out.println(orangesFell);
    }
}