package DataStructures.Arrays;

import java.util.Arrays;
import java.util.Random;

public class MinElement{
    public static void main(String args[]){
        int arr[] = generate(50);
        System.out.println("Array : " + Arrays.toString(arr));
        System.out.println("Min element : " + minElement(arr));
    }
    public static int[] generate(int size){
        Random randInt = new Random();
        int arr[] = new int[size];
        for (int i = 0; i<size; i++){
            arr[i] = randInt.nextInt(size);
        }
        return arr;
    }
    public static int minElement(int arr[]){
        int min = arr[0];
        for (int i : arr){
            if (i < min) min = i;
        }
        return min;
    }
}
