package DataStructures.Arrays;
import java.util.*;

public class HighCandlesCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> candles = new ArrayList<>()
        for (int i = 0; i < n; i++) {
            candles.add(sc.nextInt());
        }
        int result = birthdayCakeCandles(candles);
        System.out.println(result);
        sc.close();
    }
    public static int birthdayCakeCandles(List<Integer> candles) {
        int max = Integer.MIN_VALUE;
        int count = 0;
        for (int i = 0; i < candles.size(); i++) {
            int height = candles.get(i);

            if (height > max) {
                max = height;
                count = 1;
            } else if (height == max) {
                count++;
            }
        }
        return count;
    }
}