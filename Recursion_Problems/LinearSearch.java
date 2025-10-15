package Recursion_Problems;

class LinearSearch{
    public static void main(String[] args){
        int[] exampleArr = {1,7,4,3,2,5,6,8};
        
        if (Search(exampleArr, 0, 0) == -1){
            System.out.print("Index not Found");
        }
        else{
            System.out.print("Index Found at " + Search(exampleArr, 0, 0));
        }
    }

    public static int Search(int[] arr, int target, int index){
        if (index == arr.length-1){             // Base condition - 1 : if array limit exceeds return -1
            return -1;
        }
        else if (arr[index] == target){         // Base condition - 2 : if target is found at arr[index], return index
            return index;
        }
        return Search(arr, target, ++index);    // Recurse condition : Index + 1 post-fix used to avoid overflow.
    }
}