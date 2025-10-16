package Recursion_Problems;
import java.util.ArrayList;

public class ArrayListReturn {
    public static void main(String[] args) {
        int[] example_arr1 = {1,2,3,4,4,4,5,5,6,6,6,6,6,6};
        ArrayList<Integer> result = new ArrayList<Integer>();
        System.out.print("[ ");
        for (int number : returnArrayList(example_arr1, result, 0, 0, 6)) {
            System.out.print(number + " ");
        }
        System.out.print("]");
    }
    public static ArrayList<Integer> returnArrayList(int[] arr, ArrayList<Integer> result , int index, int i , int target){
        if (index == arr.length){
            return result;
        }
        if(arr[index] == target){ 
            result.add(index);
        }
        return returnArrayList(arr, result, ++index, i, target);
    }
}
