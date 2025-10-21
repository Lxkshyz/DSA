package SortingAlgorithms;
import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] example_Arr = {10,6,2,4,3,1,5,7,9,8};
        System.out.println(Arrays.toString(mergeSort(example_Arr)));

    }
    public static int[] mergeSort(int[] arr){
        if (arr.length == 1){
            return arr;
        }
        int mid = arr.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(left, right);
    }

    public static int[] merge(int[] left, int[] right){
        int[] final_Arr = new int[left.length + right.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < left.length && j < right.length){
            if (left[i] < right[j]){
                final_Arr[k] = left[i];
                i++;
            }
            else{
                final_Arr[k] = right[j];
                j++;
            }
            k++;
        }

        // if one of the array not complete
        while (i<left.length){
            final_Arr[k] = left[i];
            i++;
            k++;
        }
        while (j<right.length){
            final_Arr[k] = right[j];
            j++;
            k++;
        }
        return final_Arr;
    }
}
