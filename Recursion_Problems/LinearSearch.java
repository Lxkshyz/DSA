package Recursion_Problems;

class LinearSearch{
    public static void main(String[] args){
        int[] exampleArr = {1,7,4,3,2,5,6,8};
        // Approach for linear Search, 
        System.out.print(Search(exampleArr, 0, 0));
    }

    public static int Search(int[] arr, int target, int index){
        if (index == arr.length-1){
            return -1;
        }
        else if (arr[index] == target){
            return index;
        }
        return Search(arr, target, ++index);
    }
}