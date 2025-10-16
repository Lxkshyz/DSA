package Recursion_Problems;
import java.util.Arrays;

public class ArrayListReturn {
    public static void main(String[] args) {
        int[] example_arr1 = {1,2,3,4,4,4};
        int[] result = new int[3];
        System.out.println(Arrays.toString(returnArrayList(example_arr1, result, 0, 0, 4)));

    }
    public static int[] returnArrayList(int[] arr, int[] result , int index, int i , int target){
        if (index == arr.length){
            return result;
        }
        if(arr[index] == target){ 
            result[i++] = index;
        }
        return returnArrayList(arr, result, ++index, i, target);
    }
}
