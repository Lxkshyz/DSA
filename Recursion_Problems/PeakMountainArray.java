package Recursion_Problems;
public class PeakMountainArray {
    public static void main(String[] args) {
        int[] example_arr = {1,2,3,4,5,4,3,2,1,0};
        int s = 0;
        int e = example_arr.length - 1;
        System.out.println(peakMountain(example_arr, s, e));
    }
    
    public static int peakMountain(int[] arr, int s, int e){
        int mid = s + (e-s) / 2;
        if (mid < e && arr[mid] > arr[mid + 1]){
            return mid;
        }
        if (mid > s && arr[mid] < arr[mid-1]){
            return mid - 1;
        }

        if (arr[mid] >= arr[s]){
            return peakMountain(arr, mid+1, e);
        }
        else{
            return peakMountain(arr, s, mid -1);
        }
    }
    
}
