package DataStructures.Arrays;

import java.util.*;

// absolute difference between the sums of its diagonals.
public class DiagonalDifference {

    public static void main(String[] args) {
        List<List<Integer>> arr = new ArrayList<>();
        arr.add(Arrays.asList(1, 2, 3));
        arr.add(Arrays.asList(4, 5, 6));
        arr.add(Arrays.asList(9, 8, 9));
        System.out.println("Diagonal difference : " + diagonalDifference(arr));
    }

    public static int diagonalDifference(List<List<Integer>> arr) {
        int n = arr.size();
        int primary = 0;
        int secondary = 0;

        for (int i = 0; i < n; i++) {
            primary += arr.get(i).get(i);
            secondary += arr.get(i).get(n - 1 - i);
        }
        return Math.abs(primary - secondary);
    }
}