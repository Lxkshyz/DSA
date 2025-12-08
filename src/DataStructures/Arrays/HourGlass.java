package DataStructures.Arrays;

public class HourGlass {
    public static void main(String args[]){
        int[][] nums ={ {3, -6, 4, 6, 7, 8},
                        {5, -3, 3, -9, 8, 3},
                        {6, 4, 9, 9, -4, 4},
                        {4, 5, -5, 8, -2, 6}};
        hourGlassSum(nums);
    }
    public static void hourGlassSum(int[][] arr){
        int result = Integer.MIN_VALUE;
        int[] best = new int[7];
        for (int i = 0; i<=arr.length-3; i++){
            for (int j = 0; j<=arr[i].length-3; j++){
                int sum = arr[i][j] + arr[i][j+1] + arr[i][j+2]
                        + arr[i+1][j+1]
                        + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
                if (sum > result) {
                    result = sum;
                    System.out.println();
                    best[0] = arr[i][j];
                    best[1] = arr[i][j+1];
                    best[2] = arr[i][j+2];
                    best[3] = arr[i+1][j+1];
                    best[4] = arr[i+2][j];
                    best[5] = arr[i+2][j+1];
                    best[6] = arr[i+2][j+2];
                }

            }
        }
        System.out.println("Max Hourglass : " + result);
        System.out.printf("%d %d %d\n  %d\n%d %d %d\n", best[0], best[1], best[2], best[3], best[4], best[5], best[6]);
    }
}
