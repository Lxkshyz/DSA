package DataStructures.Arrays;
import java.util.Random;
import java.util.Arrays;

public class MaxElement {
    public static void main(String args[]){
        int arr[] = generate(50);
        System.out.println("Array : " + Arrays.toString(arr));
        System.out.println("Max element : " + maxElement(arr));
    }
    public static int[] generate(int size){
        Random randInt = new Random();
        int arr[] = new int[size];
        for (int i = 0; i<size; i++){
            arr[i] = randInt.nextInt(size);
        }
        return arr;
    }
    public static int maxElement(int arr[]){
        int max = arr[0];
        for (int i : arr){
            if (i > max) max = i;
        }
        return max;
    }
}



