package Iteration_Problems;
import java.util.List;
import java.util.ArrayList;

public class subSequenceArray {
    public static void man(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(subSequence(arr));
    }
    public static List<List<Integer>> subSequence(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        for (int num : arr){
            int n = outer.size();
            for(int i = 0; i < n; i++){
                List<Integer> temp = new ArrayList<>(outer.get(i));
                temp.add(num);
                outer.add(temp);
            }
        }
        return outer;

    }
    
    
}
