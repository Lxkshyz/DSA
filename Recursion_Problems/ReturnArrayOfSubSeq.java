package Recursion_Problems;
import java.util.ArrayList;

public class ReturnArrayOfSubSeq {
    public static void main(String[] args) {
        String str = "abc";
        System.out.println(subSeq("", str));

    }
    public static ArrayList<String> subSeq(String processed, String Unprocessed){
        if (Unprocessed.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            if (!processed.isEmpty()){
                list.add(processed);
            }
            return list;
        }
        char ch = Unprocessed.charAt(0);
        ArrayList<String> left = subSeq(ch + processed, Unprocessed.substring(1));
        ArrayList<String> right = subSeq(processed, Unprocessed.substring(1));
        left.addAll(right);
        return left;
    }
}
