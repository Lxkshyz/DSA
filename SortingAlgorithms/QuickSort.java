package SortingAlgorithms;
import java.util.Arrays;


class QuickSort{
    public static void main(String[] args){
        int[] example_Arr = {6,5,4,3,2,1,0};
        quickSort(example_Arr, 0, example_Arr.length-1);
        System.out.println(Arrays.toString(example_Arr));

    }

    public static void quickSort(int[] arr, int left, int right){
        if(left >= right){
            return;
        }
        int s = left;
        int e = right;
        int m = left + (right - left) / 2;
        int pivot = arr[m];

        while (s <= e){
            while (arr[s] < pivot){
                s++;
            }
            while (arr[e] > pivot){
                e--;
            }
            if (s<=e){
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }
        quickSort(arr, left, e);
        quickSort(arr, s, right);
    }


}