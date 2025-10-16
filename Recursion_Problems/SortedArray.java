package Recursion_Problems;

public class SortedArray {
    public static void main(String[] args) {
        int[] example_arr1 = {1,2,3,4,5};
        int[] example_arr2 = {1,2,4,5,3};

        if (checkSort(example_arr2, 0)){
            System.out.println("Array is sorted");
        }
        else{
            System.out.println("Array is not sorted");
        }
    }

    public static Boolean checkSort(int[] arr, int index){
        if (index == arr.length-1){return true;}
        if (arr[index] > arr[index+1]){return false;}
        return checkSort(arr, ++index);
    }
}
