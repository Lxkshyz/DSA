package DataStructures.Arrays;
import java.util.*;

// absolute difference between ratios of +ve, -ve and zero
public class PlusMinus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }

        plusMinus(arr);

        sc.close();
    }
    public static void plusMinus(List<Integer> arr) {
        int n = arr.size();
        int posCount = 0;
        int negCount = 0;
        int zeroCount = 0;

        for (int i : arr) {
            if (i > 0) {
                posCount++;
            } else if (i < 0) {
                negCount++;
            } else {
                zeroCount++;
            }
        }
        System.out.printf("%.6f\n%.6f\n%.6f\n",
                (double) posCount / n,
                (double) negCount / n,
                (double) zeroCount / n
        );
    }
}