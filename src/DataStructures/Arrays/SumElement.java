package DataStructures.Arrays;

import java.util.Arrays;
import java.util.Random;

public class SumElement {
    public static void main(String args[]){
        int arr[] = generate(10);
        System.out.println("Array : " + Arrays.toString(arr));
        System.out.println("Sum of all element : " + sumElement(arr));
    }
    public static int[] generate(int size){
        Random randInt = new Random();
        int arr[] = new int[size];
        for (int i = 0; i<size; i++){
            arr[i] = randInt.nextInt(size)+1;
        }
        return arr;
    }
    public static int sumElement(int arr[]){
        int sum = 0;
        for (int i : arr){
            sum += i;
        }
        return sum;
    }
}