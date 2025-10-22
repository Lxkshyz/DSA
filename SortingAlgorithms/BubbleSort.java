package SortingAlgorithms;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] example_Arr = {7,8,9,5,4,6,3,2,1};
        System.out.println(Arrays.toString(bubbleSort(example_Arr)));
    }

    public static int[] bubbleSort(int[] arr){
        for (int i = 0; i<arr.length -1; i++){
            for (int j = 0; j<arr.length - i - 1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
}
