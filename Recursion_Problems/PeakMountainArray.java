package Recursion_Problems;
public class PeakMountainArray {
    public static void main(String[] args) {
        int[] example_arr = {24,69,100,99,79,78,67,36,26,19};
        int s = 0;
        int e = example_arr.length - 1;
        System.out.println(peakMountain(example_arr, s, e));
    }
    
    public static int peakMountain(int[] arr, int s, int e){
        int mid = s + (e-s) / 2;
        if (s==e){
            return s;
        }
        if (arr[mid] < arr[mid +1]){
            return peakMountain(arr, mid+1, e);
        }
        else{
            return peakMountain(arr, s, mid);
        }
        
    }
    
    
}
