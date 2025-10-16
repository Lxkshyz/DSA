package Recursion_Problems;
public class BinarySearch {
    public static void main(String[] args) {
        int[] example_arr = {1,2,3,4,5,6,7,8,9};
        System.out.println("Index: " + Search(example_arr, 0, 0, example_arr.length-1));
    }
    public static int Search(int[] arr, int target, int s, int e){
        int mid = s + (e - s) / 2;
        if (arr == null || arr.length == 0) return -1;
        if (s > e) return -1;
        
        if (arr[mid] == target){
            return mid;
        }
        else if (arr[mid] < target){
            return Search(arr, target, mid + 1, e);
        }
        else{
            return Search(arr, target, s, mid - 1);
        }
    }
}
