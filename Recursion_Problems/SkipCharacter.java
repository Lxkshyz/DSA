package Recursion_Problems;


public class SkipCharacter {
    public static void main(String[] args) {
        String a = "baccad";
        System.out.println(skip(a, 'a', 0, ""));
    }

    public static String skip(String a, char toSkip, int count, String ans) {
        if (count == a.length()) return ans;
        if (a.charAt(count) != toSkip) {
            ans += a.charAt(count);
        }
        return skip(a, toSkip, ++count, ans);
    }
}