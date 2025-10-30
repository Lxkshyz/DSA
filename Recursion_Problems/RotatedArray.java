package Recursion_Problems;

public class RotatedArray {
    public static void main(String[] args) {
        int[] example_arr = {7,8,9,1,2,3,4,5,6};
        System.out.println(logicBS(example_arr, 5));
    }
    public static int findPeak(int[] arr, int s, int e){
        int m = s + (e-s) / 2;
        if (m < e && arr[m] > arr[m+1]){
            return m;
        }
        if (m > s && arr[m] < arr[m-1]){
            return m-1;
        }
        if (arr[m] >= arr[s]){
            return findPeak(arr, m+1, e);
        }
        else{
            return findPeak(arr, s, m-1);
        }
    }


    
    public static int binarySearch(int[] arr, int target, int s, int e){
        int m = s + (e - s) / 2;
        if(s>e){
            return -1;
        }
        if(arr[m] == target){
            return m;
        }
        else if (arr[m] > target){
            return binarySearch(arr, target, s, m-1);
        }
        else{
            return binarySearch(arr, target, m+1, e);
        }
    }
    public static int logicBS(int[] arr, int target){
        int pivot = findPeak(arr, 0, arr.length-1) + 1;
        
        int result_1 = binarySearch(arr, target, 0, pivot-1);
        int result_2 = binarySearch(arr, target, pivot, arr.length-1);

        if (result_1 == -1)     return result_2;
        else                    return result_1;
    }   
}